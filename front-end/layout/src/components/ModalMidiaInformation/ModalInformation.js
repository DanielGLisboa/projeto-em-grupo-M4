import React, { useState } from 'react';
import styles from "./ModalInformation.module.css"
import { Button, Modal, ModalHeader, ModalBody, ModalFooter } from 'reactstrap';

function ModalInformation() {
  const [modal, setModal] = useState(false);

  function toggle(){ setModal(!modal)};

  return (
    <div>
      <span className={styles.Information} onClick={toggle}>
      </span>

      <Modal isOpen={modal} toggle={toggle} >
        <ModalHeader className={styles.BgBlack}>
        <button className={styles.btnClose}onClick={toggle}>
        </button>
        <div className={styles.imgHeaderModal}></div>
        </ModalHeader>
        <ModalBody className={styles.BgBlack}>
        <h2>The Batman</h2> 
        <p>2h 45min</p>
        <p>2021</p>
        <br/>
        <h3>Descrição:</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
          Etiam eget ligula eu lectus lobortis condimentum.
           Aliquam nonummy auctor massa. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas
            Nulla at risus. Quisque purus magna, auctor et, sagittis ac, posuere eu, lectus. Nam mattis, felis ut adipiscing.
          </p>
        <h3>Elenco:</h3>
        <p>Lorem ipsum dolor sit ame; Lorem ipsum dolor sit ame; Lorem ipsum dolor sit ame; Lorem ipsum dolor sit ame; Lorem ipsum dolor sit ame; Lorem ipsum dolor sit ame;
        Lorem ipsum dolor sit ame; Lorem ipsum dolor sit ame. </p>
        </ModalBody>
      </Modal>
    </div>
  );
}

export default ModalInformation;