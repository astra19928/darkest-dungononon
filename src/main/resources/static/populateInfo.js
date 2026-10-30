
import { herois, quirks } from "./populateLists.js";

export function populateHeroInfo(event) {
    const listInfo = document.querySelector("#list-info");
    const nome = event.target.textContent;

    for (let h of herois) {
        if (h.nome == nome) listInfo.innerHTML = `
            <h3>${h.nome}</h3>
            <p>${h.classe}</p>
            <p>Sua arma: <b>${h.arma.nome}</b> - ${h.arma.descricao} - ${h.arma.poder} de poder</p>
            <p>Suas abilidades: </p>
            <ul>
            ${h.skills.map(s => `<li><b>${s.nome}</b> - ${s.descricao}</li>`).join("")}
            </ul>
            <p>Seus quirks: </p>
            <ul>
            ${h.quirks.map(q => `<li><b>${q.nome}</b> - ${q.efeito}</li>`).join("")}
            </ul>
        `;
    }
}

export function populateQuirkInfo(event) {
    const listInfo = document.querySelector("#list-info");
    const nome = event.target.textContent;

    for (let q of quirks) {
        if (q.nome == nome) listInfo.innerHTML = `
            <h3>${q.nome}</h3>
            <p>${q.efeito}</p>
            <p>Heróis que possuem: </p>
            <ul>
            ${q.herois.map(h => `<li>${h.nome}</li>`).join("")}
            </ul>
        `;
    }
}