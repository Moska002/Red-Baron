//
// Questo file Ŕ stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrÓ persa durante la ricompilazione dello schema di origine. 
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackId" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="LyricChecksum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LyricId" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *         &lt;element name="LyricSong" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LyricArtist" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LyricUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LyricCovertArtUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LyricRank" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="LyricCorrectUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Lyric" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Recupera il valore della proprietÓ trackId.
     *
     * @return trackId
     */
    public short getTrackId() {
        return trackId;
    }

    /**
     * Imposta il valore della proprietÓ trackId.
     *
     * @param value trackId
     */
    public void setTrackId(short value) {
        this.trackId = value;
    }

    /**
     * Recupera il valore della proprietÓ lyricChecksum.
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
     * Imposta il valore della proprietÓ lyricChecksum.
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
     * Recupera il valore della proprietÓ lyricId.
     *
     * @return trackId
     */
    public int getLyricId() {
        return lyricId;
    }

    /**
     * Imposta il valore della proprietÓ lyricId.
     *
     * @param value trackId
     */
    public void setLyricId(int value) {
        this.lyricId = value;
    }

    /**
     * Recupera il valore della proprietÓ lyricSong.
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
     * Imposta il valore della proprietÓ lyricSong.
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
     * Recupera il valore della proprietÓ lyricArtist.
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
     * Imposta il valore della proprietÓ lyricArtist.
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
     * Recupera il valore della proprietÓ lyricUrl.
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
     * Imposta il valore della proprietÓ lyricUrl.
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
     * Recupera il valore della proprietÓ lyricCovertArtUrl.
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
     * Imposta il valore della proprietÓ lyricCovertArtUrl.
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
     * Recupera il valore della proprietÓ lyricRank.
     *
     * @return lyricRank
     */
    public short getLyricRank() {
        return lyricRank;
    }

    /**
     * Imposta il valore della proprietÓ lyricRank.
     *
     * @param value lyricRank
     */
    public void setLyricRank(short value) {
        this.lyricRank = value;
    }

    /**
     * Recupera il valore della proprietÓ lyricCorrectUrl.
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
     * Imposta il valore della proprietÓ lyricCorrectUrl.
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
     * Recupera il valore della proprietÓ lyric.
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
     * Imposta il valore della proprietÓ lyric.
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
