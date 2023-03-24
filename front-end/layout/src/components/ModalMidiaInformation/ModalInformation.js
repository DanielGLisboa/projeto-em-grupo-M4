import React, { useState, useEffect } from 'react';
import styles from "./ModalInformation.module.css"
import { Button, Modal, ModalHeader, ModalBody, ModalFooter } from 'reactstrap';

function ModalInformation() {
  const [modal, setModal] = useState(false);
  
  function toggle(){setModal(!modal)};


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