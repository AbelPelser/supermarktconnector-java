package org.harrygovert.model.ah;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AHProductProperties {

    @JsonAlias("da_animal_species")
    private List<String> daAnimalSpecies;
    @JsonAlias("da_country")
    private List<String> daCountry;
    @JsonAlias("da_cutting_method")
    private List<String> daCuttingMethod;
    @JsonAlias("da_fat_content")
    private List<String> daFatContent;
    @JsonAlias("da_maturity")
    private List<String> daGrape;
    @JsonAlias("da_grape")
    private List<String> daMaturity;
    @JsonAlias("da_processing_type")
    private List<String> daProcessingType;
    @JsonAlias("da_region")
    private List<String> daRegion;
    @JsonAlias("da_shop_in_shop")
    private List<String> daShopInShop;
    @JsonAlias("da_store_department")
    private List<String> daStoreDepartment;
    @JsonAlias("da_sub_region")
    private List<String> daSubRegion;
    @JsonAlias("da_taste")
    private List<String> daTaste;
    @JsonAlias("da_wine_type")
    private List<String> daWineType;
    @JsonAlias("da_wine_taste")
    private List<String> daWineTaste;

    private List<String> diepvries;

    private List<String> nutriscore;

    @JsonAlias("np_biologisch")
    private List<String> npBiologisch;
    @JsonAlias("np_dessertwij")
    private List<String> npDessertwij;
    @JsonAlias("np_druivenras")
    private List<String> npDruivenras;
    @JsonAlias("np_duurzaam")
    private List<String> npDuurzaam;
    @JsonAlias("np_ecologisch")
    private List<String> npEcologisch;
    @JsonAlias("np_etos")
    private List<String> npEtos;
    @JsonAlias("np_exclusief")
    private List<String> npExclusief;
    @JsonAlias("np_fairtrade")
    private List<String> npFairtrade;
    @JsonAlias("np_fase")
    private List<String> npFase;
    @JsonAlias("np_fondue")
    private List<String> npFondue;
    @JsonAlias("np_gebruikers")
    private List<String> npGebruikers;
    @JsonAlias("np_goedkoopje")
    private List<String> npGoedkoopje;
    @JsonAlias("np_greenfield")
    private List<String> npGreenfield;
    @JsonAlias("np_kant+klaar")
    private List<String> npKantKlaar;
    @JsonAlias("np_keuken")
    private List<String> npKeuken;
    @JsonAlias("np_kids")
    private List<String> npKids;
    @JsonAlias("np_kleur")
    private List<String> npKleur;
    @JsonAlias("np_klaver")
    private List<String> npKlaver;
    @JsonAlias("np_koolzuur")
    private List<String> npKoolzuur;
    @JsonAlias("np_inhoud")
    private List<String> npInhoud;
    @JsonAlias("np_laag alc%")
    private List<String> npLaagAlc;
    @JsonAlias("np_lactose")
    private List<String> npLactose;
    @JsonAlias("np_land")
    private List<String> npLand;
    @JsonAlias("np_leeftijd")
    private List<String> npLeeftijd;
    @JsonAlias("np_light")
    private List<String> npLight;
    @JsonAlias("np_lokaal")
    private List<String> npLokaal;
    @JsonAlias("np_maat")
    private List<String> npMaat;
    @JsonAlias("np_man")
    private List<String> npMan;
    @JsonAlias("np_natriumarm")
    private List<String> npNatriumarm;
    @JsonAlias("np_nieuw")
    private List<String> npNieuw;
    @JsonAlias("np_onderhoud")
    private List<String> npOnderhoud;
    @JsonAlias("np_oogstjaar")
    private List<String> npOogstjaar;
    @JsonAlias("np_oostersekr")
    private List<String> npOostersekr;
    @JsonAlias("np_op=op")
    private List<String> npOpOp;
    @JsonAlias("np_ouderen")
    private List<String> npOuderen;
    @JsonAlias("np_portieverp")
    private List<String> npPortieVerp;
    @JsonAlias("np_prijsjanee")
    private List<String> npPrijsJaNee;
    @JsonAlias("np_prijswinn")
    private List<String> npPrijswinn;
    @JsonAlias("np_puureerlij")
    private List<String> npPuureerlij;
    @JsonAlias("np_rijping")
    private List<String> npRijping;
    @JsonAlias("np_scharrel")
    private List<String> npScharrel;
    @JsonAlias("np_seizoen")
    private List<String> npSeizoen;
    @JsonAlias("np_smaak")
    private List<String> npSmaak;
    @JsonAlias("np_snelkook")
    private List<String> npSnelkook;
    @JsonAlias("np_sojazuivel")
    private List<String> npSojazuivel;
    @JsonAlias("np_soort")
    private List<String> npSoort;
    @JsonAlias("np_streek")
    private List<String> npStreek;
    @JsonAlias("np_suikergeha")
    private List<String> npSuikergeha;
    @JsonAlias("np_suikervrij")
    private List<String> npSuikervrij;
    @JsonAlias("np_tabak")
    private List<String> npTabak;
    @JsonAlias("np_toepassing")
    private List<String> npToepassing;
    @JsonAlias("np_vegetarisc")
    private List<String> npVegetarisc;
    @JsonAlias("np_verbluffen")
    private List<String> npVerbluffen;
    @JsonAlias("np_verpakking")
    private List<String> npVerpakking;
    @JsonAlias("np_versheid")
    private List<String> npVersheid;
    @JsonAlias("np_vetgehalte")
    private List<String> npVetgehalte;
    @JsonAlias("np_voordeel")
    private List<String> npVoordeel;
    @JsonAlias("np_vorm")
    private List<String> npVorm;
    @JsonAlias("np_wereld")
    private List<String> npWereld;
    @JsonAlias("np_wv_biolog")
    private List<String> npWvBiolog;
    @JsonAlias("np_wv_distr")
    private List<String> npWvDistr;
    @JsonAlias("np_wv_druif")
    private List<String> npWvDruif;
    @JsonAlias("np_wv_gerecht")
    private List<String> npWvGerecht;
    @JsonAlias("np_wv_hint")
    private List<String> npWvHint;
    @JsonAlias("np_wv_inhoud")
    private List<String> npWvInhoud;
    @JsonAlias("np_wv_land")
    private List<String> npWvLand;
    @JsonAlias("np_wv_moment")
    private List<String> npWvMoment;
    @JsonAlias("np_wv_profiel")
    private List<String> npWvProfiel;
    @JsonAlias("np_wv_rating")
    private List<String> npWvRating;
    @JsonAlias("np_wv_streek")
    private List<String> npWvStreek;
    @JsonAlias("np_wv_type")
    private List<String> npWvType;
    @JsonAlias("np_wv_verfijn")
    private List<String> npWvVerfijn;
    @JsonAlias("np_wv_verpakk")
    private List<String> npWvVerpakk;

    @JsonAlias("sp_bewust")
    private List<String> spBewust;
    @JsonAlias("sp_kenmerk")
    private List<String> spKenmerk;

    @JsonAlias("sp_exclude_dieet_biologisch")
    private List<String> spExcludeDieetBiologisch;
    @JsonAlias("sp_exclude_dieet_laag_suiker")
    private List<String> spExcludeDieetLaagSuiker;
    @JsonAlias("sp_exclude_dieet_laag_vet")
    private List<String> spExcludeDieetLaagVet;
    @JsonAlias("sp_exclude_dieet_laag_zout")
    private List<String> spExcludeDieetLaagZout;
    @JsonAlias("sp_exclude_dieet_veganistisch")
    private List<String> spExcludeDieetVeganistisch;
    @JsonAlias("sp_exclude_dieet_vegetarisch")
    private List<String> spExcludeDieetVegetarisch;

    @JsonAlias("sp_include_dieet_biologisch")
    private List<String> spIncludeDieetBiologisch;
    @JsonAlias("sp_include_dieet_laag_suiker")
    private List<String> spIncludeDieetLaagSuiker;
    @JsonAlias("sp_include_dieet_laag_vet")
    private List<String> spIncludeDieetLaagVet;
    @JsonAlias("sp_include_dieet_laag_zout")
    private List<String> spIncludeDieetLaagZout;
    @JsonAlias("sp_include_dieet_veganistisch")
    private List<String> spIncludeDieetVeganistisch;
    @JsonAlias("sp_include_dieet_vegetarisch")
    private List<String> spIncludeDieetVegetarisch;

    @JsonAlias("sp_exclude_intolerance_geen_eieren")
    private List<String> spExcludeIntoleranceGeenEieren;
    @JsonAlias("sp_exclude_intolerance_geen_gluten")
    private List<String> spExcludeIntoleranceGeenGluten;
    @JsonAlias("sp_exclude_intolerance_geen_kreeftachtigen")
    private List<String> spExcludeIntoleranceGeenKreeftachtigen;
    @JsonAlias("sp_exclude_intolerance_geen_lactose")
    private List<String> spExcludeIntoleranceGeenLactose;
    @JsonAlias("sp_exclude_intolerance_geen_lupine")
    private List<String> spExcludeIntoleranceGeenLupine;
    @JsonAlias("sp_exclude_intolerance_geen_melk")
    private List<String> spExcludeIntoleranceGeenMelk;
    @JsonAlias("sp_exclude_intolerance_geen_mosterd")
    private List<String> spExcludeIntoleranceGeenMosterd;
    @JsonAlias("sp_exclude_intolerance_geen_noten")
    private List<String> spExcludeIntoleranceGeenNoten;
    @JsonAlias("sp_exclude_intolerance_geen_pindas")
    private List<String> spExcludeIntoleranceGeenPindas;
    @JsonAlias("sp_exclude_intolerance_geen_schelpdieren")
    private List<String> spExcludeIntoleranceGeenSchelpdieren;
    @JsonAlias("sp_exclude_intolerance_geen_selderij")
    private List<String> spExcludeIntoleranceGeenSelderij;
    @JsonAlias("sp_exclude_intolerance_geen_sesam")
    private List<String> spExcludeIntoleranceGeenSesam;
    @JsonAlias("sp_exclude_intolerance_geen_soja")
    private List<String> spExcludeIntoleranceGeenSoja;
    @JsonAlias("sp_exclude_intolerance_geen_sulfiet")
    private List<String> spExcludeIntoleranceGeenSulfiet;
    @JsonAlias("sp_exclude_intolerance_geen_vis")
    private List<String> spExcludeIntoleranceGeenVis;

    @JsonAlias("sp_include_intolerance_geen_eieren")
    private List<String> spIncludeIntoleranceGeenEieren;
    @JsonAlias("sp_include_intolerance_geen_gluten")
    private List<String> spIncludeIntoleranceGeenGluten;
    @JsonAlias("sp_include_intolerance_geen_kreeftachtigen")
    private List<String> spIncludeIntoleranceGeenKreeftachtigen;
    @JsonAlias("sp_include_intolerance_geen_lactose")
    private List<String> spIncludeIntoleranceGeenLactose;
    @JsonAlias("sp_include_intolerance_geen_lupine")
    private List<String> spIncludeIntoleranceGeenLupine;
    @JsonAlias("sp_include_intolerance_geen_melk")
    private List<String> spIncludeIntoleranceGeenMelk;
    @JsonAlias("sp_include_intolerance_geen_mosterd")
    private List<String> spIncludeIntoleranceGeenMosterd;
    @JsonAlias("sp_include_intolerance_geen_noten")
    private List<String> spIncludeIntoleranceGeenNoten;
    @JsonAlias("sp_include_intolerance_geen_pindas")
    private List<String> spIncludeIntoleranceGeenPindas;
    @JsonAlias("sp_include_intolerance_geen_schelpdieren")
    private List<String> spIncludeIntoleranceGeenSchelpdieren;
    @JsonAlias("sp_include_intolerance_geen_selderij")
    private List<String> spIncludeIntoleranceGeenSelderij;
    @JsonAlias("sp_include_intolerance_geen_sesam")
    private List<String> spIncludeIntoleranceGeenSesam;
    @JsonAlias("sp_include_intolerance_geen_soja")
    private List<String> spIncludeIntoleranceGeenSoja;
    @JsonAlias("sp_include_intolerance_geen_sulfiet")
    private List<String> spIncludeIntoleranceGeenSulfiet;
    @JsonAlias("sp_include_intolerance_geen_vis")
    private List<String> spIncludeIntoleranceGeenVis;
}
