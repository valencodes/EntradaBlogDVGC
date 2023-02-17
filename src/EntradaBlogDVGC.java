/**
 * Clase para manejar las entradas de un blog.
 * @author Daniela Valentina Galeote Calderón
 * @version 2.3
 * @since 17.02.2023
 */
public class EntradaBlogDVGC {

        /**
         * separador es el carácter que separa ENTRADA DE del nombre del autor
         */
        public static char separador=':';
        private int id;
        private String texto;
        private String autor;

        /**
         * Constructor
         * @param id número de entrada
         * @param autor autor de la entrada
         * @param texto texto que contiene la entrada
         * @throws IllegalArgumentException Si el número de entrada es negativo, lanza una excepción.
         */
        public EntradaBlogDVGC(int id, String autor, String texto)throws IllegalArgumentException{
                if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
                this.id=id;
                this.autor=autor;
                this.texto=texto;
        }

        /**
         *
         * @return cad toString con el formato en el que se imprimirá la noticia en pantalla
         */
        @Override
        public String toString(){
                String cad="";
                cad+="\nENTRADA DE"+separador+autor;
                cad+="\n "+texto;
                return cad;
        }

        /**
         * @return el número de la entrada
         */
        public int getId(){
                return this.id;
        }

        /**
         * @return texto completo de la entrada
         */
        public String getTexto(){
                return this.texto;
        }

        /**
         * @return nombre del autor de la entrada en mayúsculas
         */
        public String getAutor(){
        return this.autor.toUpperCase();
        }
}
