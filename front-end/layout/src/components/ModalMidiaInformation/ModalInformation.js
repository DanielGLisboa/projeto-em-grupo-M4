import React, { useState, useEffect } from 'react';
import styles from "./ModalInformation.module.css"
import { Button, Modal, ModalHeader, ModalBody, ModalFooter } from 'reactstrap';

function ModalInformation() {
  const [modal, setModal] = useState(false);

  const [films, setFilms] = useState([{}])

  useEffect(()=>{
      fetch("http://localhost:8090/apivaldisnei/filme")
      .then(response => response.json())
      .then(data => setFilms(data))
    }, [])

  let Midia = films.find(film => film.id == 1)
  
  function toggle(){
     console.log(Midia)
     setModal(!modal)};

  return (
    <div>
      <span className={styles.Information} onClick={toggle}>
      </span>

      <Modal isOpen={modal} toggle={toggle} >
        <ModalHeader  style={{ backgroundImage: "url(https://www.salonlfc.com/wp-content/uploads/2018/01/image-not-found-1-scaled.png)" }} className={styles.BgBlack}>
        <button className={styles.btnClose}onClick={toggle}>
        </button>
        <div className={styles.imgHeaderModal}></div>
        </ModalHeader>
        <ModalBody className={styles.BgBlack}>
        <h2>Titulo</h2> 
        <p> duração</p>
        <p>ano</p>
        <br/>
        <h3>Sinopse</h3>
        <p></p>
        </ModalBody>
      </Modal>
    </div>
  );
}

export default ModalInformation;