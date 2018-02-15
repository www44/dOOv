/*
 * Copyright 2017 Courtanet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.doov.sample2.field;

import io.doov.core.PathConstraint;

public enum Sample2Constraint implements PathConstraint {
    NONE(""), //
    ACCOUNT_1("getAccount1()"), //
    ACCOUNT_2("getAccount2()"), //
    ACCOUNT_3("getAccount3()"), //
    ACCOUNT_4("getAccount4()"), //
    ACCOUNT_5("getAccount5()"), //
    ACCOUNT_6("getAccount6()"), //
    ACCOUNT_7("getAccount7()"), //
    ACCOUNT_8("getAccount8()"), //
    ACCOUNT_9("getAccount9()"), //
    ACCOUNT_10("getAccount10()"), //
    ACCOUNT_11("getAccount11()"), //
    ACCOUNT_12("getAccount12()"), //
    ACCOUNT_13("getAccount13()"), //
    ACCOUNT_14("getAccount14()"), //
    ACCOUNT_15("getAccount15()"), //
    ACCOUNT_16("getAccount16()"), //
    ACCOUNT_17("getAccount17()"), //
    ACCOUNT_18("getAccount18()"), //
    ACCOUNT_19("getAccount19()"), //
    ACCOUNT_20("getAccount20()"), //
    ACCOUNT_21("getAccount21()"), //
    ACCOUNT_22("getAccount22()"), //
    ACCOUNT_23("getAccount23()"), //
    ACCOUNT_24("getAccount24()"), //
    ACCOUNT_25("getAccount25()"), //
    ACCOUNT_26("getAccount26()"), //
    ACCOUNT_27("getAccount27()"), //
    ACCOUNT_28("getAccount28()"), //
    ACCOUNT_29("getAccount29()"), //
    ACCOUNT_30("getAccount30()"), //
    ACCOUNT_31("getAccount31()"), //
    ACCOUNT_32("getAccount32()"), //
    ACCOUNT_33("getAccount33()"), //
    ACCOUNT_34("getAccount34()"), //
    ACCOUNT_35("getAccount35()"), //
    ACCOUNT_36("getAccount36()"), //
    ACCOUNT_37("getAccount37()"), //
    ACCOUNT_38("getAccount38()"), //
    ACCOUNT_39("getAccount39()"), //
    ACCOUNT_40("getAccount40()"), //
    ACCOUNT_41("getAccount41()"), //
    ACCOUNT_42("getAccount42()"), //
    ACCOUNT_43("getAccount43()"), //
    ACCOUNT_44("getAccount44()"), //
    ACCOUNT_45("getAccount45()"), //
    ACCOUNT_46("getAccount46()"), //
    ACCOUNT_47("getAccount47()"), //
    ACCOUNT_48("getAccount48()"), //
    ACCOUNT_49("getAccount49()"), //
    ACCOUNT_50("getAccount50()"), //
    ACCOUNT_51("getAccount51()"), //
    ACCOUNT_52("getAccount52()"), //
    ACCOUNT_53("getAccount53()"), //
    ACCOUNT_54("getAccount54()"), //
    ACCOUNT_55("getAccount55()"), //
    ACCOUNT_56("getAccount56()"), //
    ACCOUNT_57("getAccount57()"), //
    ACCOUNT_58("getAccount58()"), //
    ACCOUNT_59("getAccount59()"), //
    ACCOUNT_60("getAccount60()"), //
    ACCOUNT_61("getAccount61()"), //
    ACCOUNT_62("getAccount62()"), //
    ACCOUNT_63("getAccount63()"), //
    ACCOUNT_64("getAccount64()"), //
    ACCOUNT_65("getAccount65()"), //
    ACCOUNT_66("getAccount66()"), //
    ACCOUNT_67("getAccount67()"), //
    ACCOUNT_68("getAccount68()"), //
    ACCOUNT_69("getAccount69()"), //
    ACCOUNT_70("getAccount70()"), //
    ACCOUNT_71("getAccount71()"), //
    ACCOUNT_72("getAccount72()"), //
    ACCOUNT_73("getAccount73()"), //
    ACCOUNT_74("getAccount74()"), //
    ACCOUNT_75("getAccount75()"), //
    ACCOUNT_76("getAccount76()"), //
    ACCOUNT_77("getAccount77()"), //
    ACCOUNT_78("getAccount78()"), //
    ACCOUNT_79("getAccount79()"), //
    ACCOUNT_80("getAccount80()"), //
    ACCOUNT_81("getAccount81()"), //
    ACCOUNT_82("getAccount82()"), //
    ACCOUNT_83("getAccount83()"), //
    ACCOUNT_84("getAccount84()"), //
    ACCOUNT_85("getAccount85()"), //
    ACCOUNT_86("getAccount86()"), //
    ACCOUNT_87("getAccount87()"), //
    ACCOUNT_88("getAccount88()"), //
    ACCOUNT_89("getAccount89()"), //
    ACCOUNT_90("getAccount90()"), //
    ACCOUNT_91("getAccount91()"), //
    ACCOUNT_92("getAccount92()"), //
    ACCOUNT_93("getAccount93()"), //
    ACCOUNT_94("getAccount94()"), //
    ACCOUNT_95("getAccount95()"), //
    ACCOUNT_96("getAccount96()"), //
    ACCOUNT_97("getAccount97()"), //
    ACCOUNT_98("getAccount98()"), //
    ACCOUNT_99("getAccount99()"), //
    ACCOUNT_100("getAccount100()"), //

    ACCOUNT_101("getAccount101()"), //
    ACCOUNT_102("getAccount102()"), //
    ACCOUNT_103("getAccount103()"), //
    ACCOUNT_104("getAccount104()"), //
    ACCOUNT_105("getAccount105()"), //
    ACCOUNT_106("getAccount106()"), //
    ACCOUNT_107("getAccount107()"), //
    ACCOUNT_108("getAccount108()"), //
    ACCOUNT_109("getAccount109()"), //
    ACCOUNT_110("getAccount110()"), //
    ACCOUNT_111("getAccount111()"), //
    ACCOUNT_112("getAccount112()"), //
    ACCOUNT_113("getAccount113()"), //
    ACCOUNT_114("getAccount114()"), //
    ACCOUNT_115("getAccount115()"), //
    ACCOUNT_116("getAccount116()"), //
    ACCOUNT_117("getAccount117()"), //
    ACCOUNT_118("getAccount118()"), //
    ACCOUNT_119("getAccount119()"), //
    ACCOUNT_120("getAccount120()"), //
    ACCOUNT_121("getAccount121()"), //
    ACCOUNT_122("getAccount122()"), //
    ACCOUNT_123("getAccount123()"), //
    ACCOUNT_124("getAccount124()"), //
    ACCOUNT_125("getAccount125()"), //
    ACCOUNT_126("getAccount126()"), //
    ACCOUNT_127("getAccount127()"), //
    ACCOUNT_128("getAccount128()"), //
    ACCOUNT_129("getAccount129()"), //
    ACCOUNT_130("getAccount130()"), //
    ACCOUNT_131("getAccount131()"), //
    ACCOUNT_132("getAccount132()"), //
    ACCOUNT_133("getAccount133()"), //
    ACCOUNT_134("getAccount134()"), //
    ACCOUNT_135("getAccount135()"), //
    ACCOUNT_136("getAccount136()"), //
    ACCOUNT_137("getAccount137()"), //
    ACCOUNT_138("getAccount138()"), //
    ACCOUNT_139("getAccount139()"), //
    ACCOUNT_140("getAccount140()"), //
    ACCOUNT_141("getAccount141()"), //
    ACCOUNT_142("getAccount142()"), //
    ACCOUNT_143("getAccount143()"), //
    ACCOUNT_144("getAccount144()"), //
    ACCOUNT_145("getAccount145()"), //
    ACCOUNT_146("getAccount146()"), //
    ACCOUNT_147("getAccount147()"), //
    ACCOUNT_148("getAccount148()"), //
    ACCOUNT_149("getAccount149()"), //
    ACCOUNT_150("getAccount150()"), //
    ACCOUNT_151("getAccount151()"), //
    ACCOUNT_152("getAccount152()"), //
    ACCOUNT_153("getAccount153()"), //
    ACCOUNT_154("getAccount154()"), //
    ACCOUNT_155("getAccount155()"), //
    ACCOUNT_156("getAccount156()"), //
    ACCOUNT_157("getAccount157()"), //
    ACCOUNT_158("getAccount158()"), //
    ACCOUNT_159("getAccount159()"), //
    ACCOUNT_160("getAccount160()"), //
    ACCOUNT_161("getAccount161()"), //
    ACCOUNT_162("getAccount162()"), //
    ACCOUNT_163("getAccount163()"), //
    ACCOUNT_164("getAccount164()"), //
    ACCOUNT_165("getAccount165()"), //
    ACCOUNT_166("getAccount166()"), //
    ACCOUNT_167("getAccount167()"), //
    ACCOUNT_168("getAccount168()"), //
    ACCOUNT_169("getAccount169()"), //
    ACCOUNT_170("getAccount170()"), //
    ACCOUNT_171("getAccount171()"), //
    ACCOUNT_172("getAccount172()"), //
    ACCOUNT_173("getAccount173()"), //
    ACCOUNT_174("getAccount174()"), //
    ACCOUNT_175("getAccount175()"), //
    ACCOUNT_176("getAccount176()"), //
    ACCOUNT_177("getAccount177()"), //
    ACCOUNT_178("getAccount178()"), //
    ACCOUNT_179("getAccount179()"), //
    ACCOUNT_180("getAccount180()"), //
    ACCOUNT_181("getAccount181()"), //
    ACCOUNT_182("getAccount182()"), //
    ACCOUNT_183("getAccount183()"), //
    ACCOUNT_184("getAccount184()"), //
    ACCOUNT_185("getAccount185()"), //
    ACCOUNT_186("getAccount186()"), //
    ACCOUNT_187("getAccount187()"), //
    ACCOUNT_188("getAccount188()"), //
    ACCOUNT_189("getAccount189()"), //
    ACCOUNT_190("getAccount190()"), //
    ACCOUNT_191("getAccount191()"), //
    ACCOUNT_192("getAccount192()"), //
    ACCOUNT_193("getAccount193()"), //
    ACCOUNT_194("getAccount194()"), //
    ACCOUNT_195("getAccount195()"), //
    ACCOUNT_196("getAccount196()"), //
    ACCOUNT_197("getAccount197()"), //
    ACCOUNT_198("getAccount198()"), //
    ACCOUNT_199("getAccount199()"), //
    ACCOUNT_200("getAccount200()"), //
    ACCOUNT_201("getAccount201()"), //
    ACCOUNT_202("getAccount202()"), //
    ACCOUNT_203("getAccount203()"), //
    ACCOUNT_204("getAccount204()"), //
    ACCOUNT_205("getAccount205()"), //
    ACCOUNT_206("getAccount206()"), //
    ACCOUNT_207("getAccount207()"), //
    ACCOUNT_208("getAccount208()"), //
    ACCOUNT_209("getAccount209()"), //
    ACCOUNT_210("getAccount210()"), //
    ACCOUNT_211("getAccount211()"), //
    ACCOUNT_212("getAccount212()"), //
    ACCOUNT_213("getAccount213()"), //
    ACCOUNT_214("getAccount214()"), //
    ACCOUNT_215("getAccount215()"), //
    ACCOUNT_216("getAccount216()"), //
    ACCOUNT_217("getAccount217()"), //
    ACCOUNT_218("getAccount218()"), //
    ACCOUNT_219("getAccount219()"), //
    ACCOUNT_220("getAccount220()"), //
    ACCOUNT_221("getAccount221()"), //
    ACCOUNT_222("getAccount222()"), //
    ACCOUNT_223("getAccount223()"), //
    ACCOUNT_224("getAccount224()"), //
    ACCOUNT_225("getAccount225()"), //
    ACCOUNT_226("getAccount226()"), //
    ACCOUNT_227("getAccount227()"), //
    ACCOUNT_228("getAccount228()"), //
    ACCOUNT_229("getAccount229()"), //
    ACCOUNT_230("getAccount230()"), //
    ACCOUNT_231("getAccount231()"), //
    ACCOUNT_232("getAccount232()"), //
    ACCOUNT_233("getAccount233()"), //
    ACCOUNT_234("getAccount234()"), //
    ACCOUNT_235("getAccount235()"), //
    ACCOUNT_236("getAccount236()"), //
    ACCOUNT_237("getAccount237()"), //
    ACCOUNT_238("getAccount238()"), //
    ACCOUNT_239("getAccount239()"), //
    ACCOUNT_240("getAccount240()"), //
    ACCOUNT_241("getAccount241()"), //
    ACCOUNT_242("getAccount242()"), //
    ACCOUNT_243("getAccount243()"), //
    ACCOUNT_244("getAccount244()"), //
    ACCOUNT_245("getAccount245()"), //
    ACCOUNT_246("getAccount246()"), //
    ACCOUNT_247("getAccount247()"), //
    ACCOUNT_248("getAccount248()"), //
    ACCOUNT_249("getAccount249()"), //
    ACCOUNT_250("getAccount250()"), //
    ACCOUNT_251("getAccount251()"), //
    ACCOUNT_252("getAccount252()"), //
    ACCOUNT_253("getAccount253()"), //
    ACCOUNT_254("getAccount254()"), //
    ACCOUNT_255("getAccount255()"), //
    ACCOUNT_256("getAccount256()"), //
    ACCOUNT_257("getAccount257()"), //
    ACCOUNT_258("getAccount258()"), //
    ACCOUNT_259("getAccount259()"), //
    ACCOUNT_260("getAccount260()"), //
    ACCOUNT_261("getAccount261()"), //
    ACCOUNT_262("getAccount262()"), //
    ACCOUNT_263("getAccount263()"), //
    ACCOUNT_264("getAccount264()"), //
    ACCOUNT_265("getAccount265()"), //
    ACCOUNT_266("getAccount266()"), //
    ACCOUNT_267("getAccount267()"), //
    ACCOUNT_268("getAccount268()"), //
    ACCOUNT_269("getAccount269()"), //
    ACCOUNT_270("getAccount270()"), //
    ACCOUNT_271("getAccount271()"), //
    ACCOUNT_272("getAccount272()"), //
    ACCOUNT_273("getAccount273()"), //
    ACCOUNT_274("getAccount274()"), //
    ACCOUNT_275("getAccount275()"), //
    ACCOUNT_276("getAccount276()"), //
    ACCOUNT_277("getAccount277()"), //
    ACCOUNT_278("getAccount278()"), //
    ACCOUNT_279("getAccount279()"), //
    ACCOUNT_280("getAccount280()"), //
    ACCOUNT_281("getAccount281()"), //
    ACCOUNT_282("getAccount282()"), //
    ACCOUNT_283("getAccount283()"), //
    ACCOUNT_284("getAccount284()"), //
    ACCOUNT_285("getAccount285()"), //
    ACCOUNT_286("getAccount286()"), //
    ACCOUNT_287("getAccount287()"), //
    ACCOUNT_288("getAccount288()"), //
    ACCOUNT_289("getAccount289()"), //
    ACCOUNT_290("getAccount290()"), //
    ACCOUNT_291("getAccount291()"), //
    ACCOUNT_292("getAccount292()"), //
    ACCOUNT_293("getAccount293()"), //
    ACCOUNT_294("getAccount294()"), //
    ACCOUNT_295("getAccount295()"), //
    ACCOUNT_296("getAccount296()"), //
    ACCOUNT_297("getAccount297()"), //
    ACCOUNT_298("getAccount298()"), //
    ACCOUNT_299("getAccount299()"), //
    ACCOUNT_300("getAccount300()"), //
    ACCOUNT_301("getAccount301()"), //
    ACCOUNT_302("getAccount302()"), //
    ACCOUNT_303("getAccount303()"), //
    ACCOUNT_304("getAccount304()"), //
    ACCOUNT_305("getAccount305()"), //
    ACCOUNT_306("getAccount306()"), //
    ACCOUNT_307("getAccount307()"), //
    ACCOUNT_308("getAccount308()"), //
    ACCOUNT_309("getAccount309()"), //
    ACCOUNT_310("getAccount310()"), //
    ACCOUNT_311("getAccount311()"), //
    ACCOUNT_312("getAccount312()"), //
    ACCOUNT_313("getAccount313()"), //
    ACCOUNT_314("getAccount314()"), //
    ACCOUNT_315("getAccount315()"), //
    ACCOUNT_316("getAccount316()"), //
    ACCOUNT_317("getAccount317()"), //
    ACCOUNT_318("getAccount318()"), //
    ACCOUNT_319("getAccount319()"), //
    ACCOUNT_320("getAccount320()"), //
    ACCOUNT_321("getAccount321()"), //
    ACCOUNT_322("getAccount322()"), //
    ACCOUNT_323("getAccount323()"), //
    ACCOUNT_324("getAccount324()"), //
    ACCOUNT_325("getAccount325()"), //
    ACCOUNT_326("getAccount326()"), //
    ACCOUNT_327("getAccount327()"), //
    ACCOUNT_328("getAccount328()"), //
    ACCOUNT_329("getAccount329()"), //
    ACCOUNT_330("getAccount330()"), //
    ACCOUNT_331("getAccount331()"), //
    ACCOUNT_332("getAccount332()"), //
    ACCOUNT_333("getAccount333()"), //
    ACCOUNT_334("getAccount334()"), //
    ACCOUNT_335("getAccount335()"), //
    ACCOUNT_336("getAccount336()"), //
    ACCOUNT_337("getAccount337()"), //
    ACCOUNT_338("getAccount338()"), //
    ACCOUNT_339("getAccount339()"), //
    ACCOUNT_340("getAccount340()"), //
    ACCOUNT_341("getAccount341()"), //
    ACCOUNT_342("getAccount342()"), //
    ACCOUNT_343("getAccount343()"), //
    ACCOUNT_344("getAccount344()"), //
    ACCOUNT_345("getAccount345()"), //
    ACCOUNT_346("getAccount346()"), //
    ACCOUNT_347("getAccount347()"), //
    ACCOUNT_348("getAccount348()"), //
    ACCOUNT_349("getAccount349()"), //
    ACCOUNT_350("getAccount350()"), //
    ACCOUNT_351("getAccount351()"), //
    ACCOUNT_352("getAccount352()"), //
    ACCOUNT_353("getAccount353()"), //
    ACCOUNT_354("getAccount354()"), //
    ACCOUNT_355("getAccount355()"), //
    ACCOUNT_356("getAccount356()"), //
    ACCOUNT_357("getAccount357()"), //
    ACCOUNT_358("getAccount358()"), //
    ACCOUNT_359("getAccount359()"), //
    ACCOUNT_360("getAccount360()"), //
    ACCOUNT_361("getAccount361()"), //
    ACCOUNT_362("getAccount362()"), //
    ACCOUNT_363("getAccount363()"), //
    ACCOUNT_364("getAccount364()"), //
    ACCOUNT_365("getAccount365()"), //
    ACCOUNT_366("getAccount366()"), //
    ACCOUNT_367("getAccount367()"), //
    ACCOUNT_368("getAccount368()"), //
    ACCOUNT_369("getAccount369()"), //
    ACCOUNT_370("getAccount370()"), //
    ACCOUNT_371("getAccount371()"), //
    ACCOUNT_372("getAccount372()"), //
    ACCOUNT_373("getAccount373()"), //
    ACCOUNT_374("getAccount374()"), //
    ACCOUNT_375("getAccount375()"), //
    ACCOUNT_376("getAccount376()"), //
    ACCOUNT_377("getAccount377()"), //
    ACCOUNT_378("getAccount378()"), //
    ACCOUNT_379("getAccount379()"), //
    ACCOUNT_380("getAccount380()"), //
    ACCOUNT_381("getAccount381()"), //
    ACCOUNT_382("getAccount382()"), //
    ACCOUNT_383("getAccount383()"), //
    ACCOUNT_384("getAccount384()"), //
    ACCOUNT_385("getAccount385()"), //
    ACCOUNT_386("getAccount386()"), //
    ACCOUNT_387("getAccount387()"), //
    ACCOUNT_388("getAccount388()"), //
    ACCOUNT_389("getAccount389()"), //
    ACCOUNT_390("getAccount390()"), //
    ACCOUNT_391("getAccount391()"), //
    ACCOUNT_392("getAccount392()"), //
    ACCOUNT_393("getAccount393()"), //
    ACCOUNT_394("getAccount394()"), //
    ACCOUNT_395("getAccount395()"), //
    ACCOUNT_396("getAccount396()"), //
    ACCOUNT_397("getAccount397()"), //
    ;

    private final String includePath;

    Sample2Constraint(String includePath) {
        this.includePath = includePath;
    }

    @Override
    public String includePath() {
        return includePath;
    }
}
