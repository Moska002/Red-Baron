//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.04.29 alle 05:44:03 PM CEST 
//


package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackId" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="LyricChecksum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LyricId" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="LyricSong" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LyricArtist" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LyricUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LyricCovertArtUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LyricRank" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="LyricCorrectUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Lyric" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trackId",
    "lyricChecksum",
    "lyricId",
    "lyricSong",
    "lyricArtist",
    "lyricUrl",
    "lyricCovertArtUrl",
    "lyricRank",
    "lyricCorrectUrl",
    "lyric"
})
@XmlRootElement(name = "GetLyricResult")
public class GetLyricResult {

    @XmlElement(name = "TrackId")
    @XmlSchemaType(name = "unsignedByte")
    protected short trackId;
    @XmlElement(name = "LyricChecksum", required = true)
    protected String lyricChecksum;
    @XmlElement(name = "LyricId")
    @XmlSchemaType(name = "unsignedShort")
    protected int lyricId;
    @XmlElement(name = "LyricSong", required = true)
    protected String lyricSong;
    @XmlElement(name = "LyricArtist", required = true)
    protected String lyricArtist;
    @XmlElement(name = "LyricUrl", required = true)
    protected String lyricUrl;
    @XmlElement(name = "LyricCovertArtUrl", required = true)
    protected String lyricCovertArtUrl;
    @XmlElement(name = "LyricRank")
    @XmlSchemaType(name = "unsignedByte")
    protected short lyricRank;
    @XmlElement(name = "LyricCorrectUrl", required = true)
    protected String lyricCorrectUrl;
    @XmlElement(name = "Lyric", required = true)
    protected String lyric;

    /**
     * Recupera il valore della proprietà trackId.
     * 
     */
    public short getTrackId() {
        return trackId;
    }

    /**
     * Imposta il valore della proprietà trackId.
     * 
     */
    public void setTrackId(short value) {
        this.trackId = value;
    }

    /**
     * Recupera il valore della proprietà lyricChecksum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyricChecksum() {
        return lyricChecksum;
    }

    /**
     * Imposta il valore della proprietà lyricChecksum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyricChecksum(String value) {
        this.lyricChecksum = value;
    }

    /**
     * Recupera il valore della proprietà lyricId.
     * 
     */
    public int getLyricId() {
        return lyricId;
    }

    /**
     * Imposta il valore della proprietà lyricId.
     * 
     */
    public void setLyricId(int value) {
        this.lyricId = value;
    }

    /**
     * Recupera il valore della proprietà lyricSong.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyricSong() {
        return lyricSong;
    }

    /**
     * Imposta il valore della proprietà lyricSong.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyricSong(String value) {
        this.lyricSong = value;
    }

    /**
     * Recupera il valore della proprietà lyricArtist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyricArtist() {
        return lyricArtist;
    }

    /**
     * Imposta il valore della proprietà lyricArtist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyricArtist(String value) {
        this.lyricArtist = value;
    }

    /**
     * Recupera il valore della proprietà lyricUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyricUrl() {
        return lyricUrl;
    }

    /**
     * Imposta il valore della proprietà lyricUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyricUrl(String value) {
        this.lyricUrl = value;
    }

    /**
     * Recupera il valore della proprietà lyricCovertArtUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyricCovertArtUrl() {
        return lyricCovertArtUrl;
    }

    /**
     * Imposta il valore della proprietà lyricCovertArtUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyricCovertArtUrl(String value) {
        this.lyricCovertArtUrl = value;
    }

    /**
     * Recupera il valore della proprietà lyricRank.
     * 
     */
    public short getLyricRank() {
        return lyricRank;
    }

    /**
     * Imposta il valore della proprietà lyricRank.
     * 
     */
    public void setLyricRank(short value) {
        this.lyricRank = value;
    }

    /**
     * Recupera il valore della proprietà lyricCorrectUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyricCorrectUrl() {
        return lyricCorrectUrl;
    }

    /**
     * Imposta il valore della proprietà lyricCorrectUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyricCorrectUrl(String value) {
        this.lyricCorrectUrl = value;
    }

    /**
     * Recupera il valore della proprietà lyric.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyric() {
        return lyric;
    }

    /**
     * Imposta il valore della proprietà lyric.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyric(String value) {
        this.lyric = value;
    }

}
