async function cargarSueldos() {
    const div = document.getElementById('sueldos');
    try {
        const profs = await fetch('/api/escolar/profesores').then(r => r.json());
        const admins = await fetch('/api/escolar/admins').then(r => r.json());
        div.innerHTML = `
            <h4>Profesores (${profs.length})</h4>
            ${profs.map((p, i) => `<div onclick="detalleProf(${i})" class="list-group-item">${p.nombre} - ${p.especialidad}</div>`).join('')}
            <h4>Admins (${admins.length})</h4>
            ${admins.map((a, i) => `<div onclick="detalleAdmin(${i})" class="list-group-item">${a.nombre} - ${a.cargo}</div>`).join('')}
        `;
    } catch(e) { div.innerHTML = 'Error cargando datos'; }
}

async function cargarNotas() {
    const div = document.getElementById('notas');
    try {
        const alumnos = await fetch('/api/escolar/alumnos').then(r => r.json());
        div.innerHTML = `
            <h4>Estudiantes (${alumnos.length})</h4>
            ${alumnos.map((a, i) => `<div onclick="detalleAlumno(${i})" class="list-group-item">${a.nombre} - ${a.curso}</div>`).join('')}
        `;
    } catch(e) { div.innerHTML = 'Error cargando datos'; }
}

async function detalleAlumno(i) {
    const alumno = await fetch(`/api/escolar/alumno/${i}`).then(r => r.json());
    const prom = alumno.notas.reduce((a,b)=>a+b)/4;
    document.getElementById('notas').innerHTML += `<div class="detalle"><strong>${alumno.nombre}</strong><br>Notas: ${alumno.notas.join(', ')}<br>Promedio: ${prom.toFixed(2)}</div>`;
}

async function detalleProf(i) {
    const prof = await fetch(`/api/escolar/profesor/${i}`).then(r => r.json());
    document.getElementById('sueldos').innerHTML += `<div class="detalle"><strong>${prof.nombre}</strong><br>Sueldo: ${prof.sueldoMensual}€<br>Horas: ${prof.horasSemanales}</div>`;
}

async function detalleAdmin(i) {
    const admin = await fetch(`/api/escolar/admin/${i}`).then(r => r.json());
    document.getElementById('sueldos').innerHTML += `<div class="detalle"><strong>${admin.nombre}</strong><br>Sueldo: ${admin.sueldoMensual}€<br>Años: ${admin.aniosAntiguedad}</div>`;
}
