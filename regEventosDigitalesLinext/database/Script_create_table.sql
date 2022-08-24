
-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`evento` (
  `idevento` VARCHAR(40) NOT NULL,
  `nombre_evento` VARCHAR(500) NOT NULL,
  `valor_evento` DOUBLE NOT NULL,
  PRIMARY KEY (`idevento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`plataforma`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`plataforma` (
  `id_plataforma` VARCHAR(40) NOT NULL,
  `nombre_plataforma` VARCHAR(500) NOT NULL,
  PRIMARY KEY (`id_plataforma`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`registro_eventos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`registro_eventos` (
  `id_registro_eventos` INT NOT NULL AUTO_INCREMENT,
  `fecha_evento` DATE NOT NULL,
  `cantidad` INT NOT NULL,
  `costo_evento` DOUBLE NOT NULL,
  `evento_idevento` VARCHAR(40) NOT NULL,
  `plataforma_id_plataforma` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`id_registro_eventos`),
  INDEX `fk_registro_eventos_evento1_idx` (`evento_idevento` ASC) VISIBLE,
  INDEX `fk_registro_eventos_plataforma1_idx` (`plataforma_id_plataforma` ASC) VISIBLE,
  CONSTRAINT `fk_registro_eventos_evento1`
    FOREIGN KEY (`evento_idevento`)
    REFERENCES `mydb`.`evento` (`idevento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registro_eventos_plataforma1`
    FOREIGN KEY (`plataforma_id_plataforma`)
    REFERENCES `mydb`.`plataforma` (`id_plataforma`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
