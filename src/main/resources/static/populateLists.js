
import { populateHeroInfo, populateQuirkInfo } from "./populateInfo.js";

window.addEventListener("load", populateLists);

export let herois, quirks;

async function populateLists() {
    const listHeroi = document.querySelector("#list-heroi");
    const listQuirk = document.querySelector("#list-quirk");

    [herois, quirks] = await Promise.all([
        fetch("/api/herois").then(r => r.json()),
        fetch("/api/quirks").then(r => r.json())
    ]);

    listHeroi.innerHTML = herois.map(h => `
        <li class="list-item heroi">${h.nome}</li>
    `).join('');

    listQuirk.innerHTML = quirks.map(q => `
        <li class="list-item quirk">${q.nome}</li>
    `).join('');

    listenListItems();
}

function listenListItems() {
    const heroiItems = document.querySelectorAll(".list-item.heroi");
    const quirkItems = document.querySelectorAll(".list-item.quirk");

    for (let h of heroiItems) {
        h.addEventListener("click", populateHeroInfo);
    }

    for (let q of quirkItems) {
        q.addEventListener("click", populateQuirkInfo);
    }
}