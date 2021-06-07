var randnum = Math.floor(Math.random()*3);

switch(randnum){
    /* Istituto's pages */
    case 0:
        document.write(`
            <div class="box">
                <a href="https://www.isitgrosseto.com/?mn=ist" target="_blank">
                    <img src="../immagini/polo-manetti.png" class="img">
                </a>
                <p>A questo link sarà possibile visionare la presentazione della scuola "Polo Manetti Porciatti" di Grosseto</p>
            </div>
            <div class="box">
                <a href="https://www.polomanettiporciatti.edu.it/pagine/regolamento-di-istituto-as-20202021?mn=ist" target="_blank">
                    <img src="../immagini/5091.png" class="img">
                </a>
                <p>A questo link sarà possibile visionare il regolamento dell'istituto</p>
            </div>
        `);
        break;
    /* Didattica's pages */
    case 1:
        document.write(`
            <div class="box">
                <a href="https://www.polomanettiporciatti.edu.it/pagine/orario-delle-lezioni---as-202021#?mn=did" target="_blank">
                    <img src="../immagini/5163.png" class="img">
                </a>
                <p>A questo link sarà possibile visionare gli orari delle varie lezioni rispetto al corso scelta e alla classe frequentata</p>
            </div>
            <div class="box">
                <a href="https://www.polomanettiporciatti.edu.it/pagine/siti-utili?mn=did" target="_blank">
                    <img src="../immagini/4991.png" class="img">
                </a>
                <p>A questo link sarà possibile visionare una serie di siti utili alla didattica</p>
            </div>
        `);
        break;
    /* Modulistica's pages */
    case 2:
        document.write(`
            <div class="box">
                <a href="https://www.polomanettiporciatti.edu.it/pagine/libri-di-testo-as-202021?mn=mod" target="_blank">
                    <img src="../immagini/5157.png" class="img">
                </a>
                <p>A questo link sarà possibile visionare i libri di testo necessari al seguito dei corsi anno 2020/2021</p>
            </div>
            <div class="box">
                <a href="https://www.polomanettiporciatti.edu.it/pagine/uscita-autonoma-del-minore-da-scuola?mn=mod" target="_blank">
                    <img src="../immagini/5165.png" class="img">
                </a>
                <p>A questo link sarà possibile visionare le liberatorie necessarie per l'uscita autonoma di un qualsiasi studente</p>
            </div>
            <div class="box">
                <a href="https://www.polomanettiporciatti.edu.it/pagine/versamenti-tasse-e-contributi?mn=mod" target="_blank">
                    <img src="../immagini/4987.png" class="img">
                </a>
                <p>A questo link sarà possibile visionare le tasse da versare al fine di poter seguire i corsi della qui presente scuola</p>
            </div>
        `);
        break;
}