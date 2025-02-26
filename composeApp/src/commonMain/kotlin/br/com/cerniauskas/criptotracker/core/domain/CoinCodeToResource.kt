package br.com.cerniauskas.criptotracker.core.domain

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import criptotracker.composeapp.generated.resources.Res
import criptotracker.composeapp.generated.resources._inch
import criptotracker.composeapp.generated.resources._st
import criptotracker.composeapp.generated.resources._xbtc
import criptotracker.composeapp.generated.resources.aave
import criptotracker.composeapp.generated.resources.abbc
import criptotracker.composeapp.generated.resources.abt
import criptotracker.composeapp.generated.resources.ac3
import criptotracker.composeapp.generated.resources.act
import criptotracker.composeapp.generated.resources.ada
import criptotracker.composeapp.generated.resources.adb
import criptotracker.composeapp.generated.resources.adx
import criptotracker.composeapp.generated.resources.ae
import criptotracker.composeapp.generated.resources.aeon
import criptotracker.composeapp.generated.resources.aergo
import criptotracker.composeapp.generated.resources.agi
import criptotracker.composeapp.generated.resources.aion
import criptotracker.composeapp.generated.resources.ait
import criptotracker.composeapp.generated.resources.akro
import criptotracker.composeapp.generated.resources.akt
import criptotracker.composeapp.generated.resources.alcx
import criptotracker.composeapp.generated.resources.aleph
import criptotracker.composeapp.generated.resources.algo
import criptotracker.composeapp.generated.resources.alis
import criptotracker.composeapp.generated.resources.alpha
import criptotracker.composeapp.generated.resources.alx
import criptotracker.composeapp.generated.resources.amb
import criptotracker.composeapp.generated.resources.amlt
import criptotracker.composeapp.generated.resources.amp
import criptotracker.composeapp.generated.resources.ampl
import criptotracker.composeapp.generated.resources.anc
import criptotracker.composeapp.generated.resources.anj
import criptotracker.composeapp.generated.resources.ankr
import criptotracker.composeapp.generated.resources.ant
import criptotracker.composeapp.generated.resources.aph
import criptotracker.composeapp.generated.resources.apl
import criptotracker.composeapp.generated.resources.appc
import criptotracker.composeapp.generated.resources.apw
import criptotracker.composeapp.generated.resources.apy
import criptotracker.composeapp.generated.resources.ar
import criptotracker.composeapp.generated.resources.ardr
import criptotracker.composeapp.generated.resources.ark
import criptotracker.composeapp.generated.resources.armor
import criptotracker.composeapp.generated.resources.arn
import criptotracker.composeapp.generated.resources.aro
import criptotracker.composeapp.generated.resources.arrr
import criptotracker.composeapp.generated.resources.ast
import criptotracker.composeapp.generated.resources.atmi
import criptotracker.composeapp.generated.resources.atom
import criptotracker.composeapp.generated.resources.auc
import criptotracker.composeapp.generated.resources.aura
import criptotracker.composeapp.generated.resources.auto
import criptotracker.composeapp.generated.resources.avax
import criptotracker.composeapp.generated.resources.awc
import criptotracker.composeapp.generated.resources.axp
import criptotracker.composeapp.generated.resources.bac
import criptotracker.composeapp.generated.resources.bal
import criptotracker.composeapp.generated.resources.band
import criptotracker.composeapp.generated.resources.bao
import criptotracker.composeapp.generated.resources.bat
import criptotracker.composeapp.generated.resources.bay
import criptotracker.composeapp.generated.resources.bbr
import criptotracker.composeapp.generated.resources.bcd
import criptotracker.composeapp.generated.resources.bch
import criptotracker.composeapp.generated.resources.bcha
import criptotracker.composeapp.generated.resources.bcn
import criptotracker.composeapp.generated.resources.bco
import criptotracker.composeapp.generated.resources.bel
import criptotracker.composeapp.generated.resources.beta
import criptotracker.composeapp.generated.resources.bf
import criptotracker.composeapp.generated.resources.bifi
import criptotracker.composeapp.generated.resources.bix
import criptotracker.composeapp.generated.resources.blk
import criptotracker.composeapp.generated.resources.block
import criptotracker.composeapp.generated.resources.blt
import criptotracker.composeapp.generated.resources.blue
import criptotracker.composeapp.generated.resources.blz
import criptotracker.composeapp.generated.resources.bnb
import criptotracker.composeapp.generated.resources.bnt
import criptotracker.composeapp.generated.resources.bond
import criptotracker.composeapp.generated.resources.bondly
import criptotracker.composeapp.generated.resources.bora
import criptotracker.composeapp.generated.resources.box
import criptotracker.composeapp.generated.resources.bpt
import criptotracker.composeapp.generated.resources.brd
import criptotracker.composeapp.generated.resources.btc
import criptotracker.composeapp.generated.resources.btc__
import criptotracker.composeapp.generated.resources.btcp
import criptotracker.composeapp.generated.resources.btg
import criptotracker.composeapp.generated.resources.btmx
import criptotracker.composeapp.generated.resources.bto
import criptotracker.composeapp.generated.resources.bts
import criptotracker.composeapp.generated.resources.btt
import criptotracker.composeapp.generated.resources.btu
import criptotracker.composeapp.generated.resources.bu
import criptotracker.composeapp.generated.resources.bunny
import criptotracker.composeapp.generated.resources.busd
import criptotracker.composeapp.generated.resources.bwt
import criptotracker.composeapp.generated.resources.bz
import criptotracker.composeapp.generated.resources.bznt
import criptotracker.composeapp.generated.resources.bzrx
import criptotracker.composeapp.generated.resources.c20
import criptotracker.composeapp.generated.resources.c98
import criptotracker.composeapp.generated.resources.cake
import criptotracker.composeapp.generated.resources.capp
import criptotracker.composeapp.generated.resources.car
import criptotracker.composeapp.generated.resources.card
import criptotracker.composeapp.generated.resources.cbat
import criptotracker.composeapp.generated.resources.cbt
import criptotracker.composeapp.generated.resources.cdai
import criptotracker.composeapp.generated.resources.cdt
import criptotracker.composeapp.generated.resources.cel
import criptotracker.composeapp.generated.resources.celo
import criptotracker.composeapp.generated.resources.celr
import criptotracker.composeapp.generated.resources.cennz
import criptotracker.composeapp.generated.resources.ceth
import criptotracker.composeapp.generated.resources.cfx
import criptotracker.composeapp.generated.resources.chai
import criptotracker.composeapp.generated.resources.chat
import criptotracker.composeapp.generated.resources.chsb
import criptotracker.composeapp.generated.resources.chz
import criptotracker.composeapp.generated.resources.ckb
import criptotracker.composeapp.generated.resources.clo
import criptotracker.composeapp.generated.resources.cloak
import criptotracker.composeapp.generated.resources.clout
import criptotracker.composeapp.generated.resources.cmt
import criptotracker.composeapp.generated.resources.cnd
import criptotracker.composeapp.generated.resources.cnx
import criptotracker.composeapp.generated.resources.comp
import criptotracker.composeapp.generated.resources.coni
import criptotracker.composeapp.generated.resources.cosm
import criptotracker.composeapp.generated.resources.coti
import criptotracker.composeapp.generated.resources.cov
import criptotracker.composeapp.generated.resources.cova
import criptotracker.composeapp.generated.resources.cover
import criptotracker.composeapp.generated.resources.cpc
import criptotracker.composeapp.generated.resources.cre
import criptotracker.composeapp.generated.resources.cream
import criptotracker.composeapp.generated.resources.cred
import criptotracker.composeapp.generated.resources.crep
import criptotracker.composeapp.generated.resources.cro
import criptotracker.composeapp.generated.resources.crpt
import criptotracker.composeapp.generated.resources.crv
import criptotracker.composeapp.generated.resources.cs
import criptotracker.composeapp.generated.resources.csai
import criptotracker.composeapp.generated.resources.csc
import criptotracker.composeapp.generated.resources.ctc
import criptotracker.composeapp.generated.resources.ctxc
import criptotracker.composeapp.generated.resources.cusdc
import criptotracker.composeapp.generated.resources.cv
import criptotracker.composeapp.generated.resources.cvc
import criptotracker.composeapp.generated.resources.cvp
import criptotracker.composeapp.generated.resources.cvt
import criptotracker.composeapp.generated.resources.cvx
import criptotracker.composeapp.generated.resources.cwbtc
import criptotracker.composeapp.generated.resources.czrx
import criptotracker.composeapp.generated.resources.dadi
import criptotracker.composeapp.generated.resources.dafi
import criptotracker.composeapp.generated.resources.dag
import criptotracker.composeapp.generated.resources.dai
import criptotracker.composeapp.generated.resources.dash
import criptotracker.composeapp.generated.resources.dat
import criptotracker.composeapp.generated.resources.data
import criptotracker.composeapp.generated.resources.datx
import criptotracker.composeapp.generated.resources.dbc
import criptotracker.composeapp.generated.resources.dcn
import criptotracker.composeapp.generated.resources.dcr
import criptotracker.composeapp.generated.resources.dct
import criptotracker.composeapp.generated.resources.ddd
import criptotracker.composeapp.generated.resources.dent
import criptotracker.composeapp.generated.resources.deri
import criptotracker.composeapp.generated.resources.dfi
import criptotracker.composeapp.generated.resources.dft
import criptotracker.composeapp.generated.resources.dfyn
import criptotracker.composeapp.generated.resources.dgb
import criptotracker.composeapp.generated.resources.dgd
import criptotracker.composeapp.generated.resources.dgtx
import criptotracker.composeapp.generated.resources.divi
import criptotracker.composeapp.generated.resources.dlt
import criptotracker.composeapp.generated.resources.dmt
import criptotracker.composeapp.generated.resources.dnt
import criptotracker.composeapp.generated.resources.dock
import criptotracker.composeapp.generated.resources.dodo
import criptotracker.composeapp.generated.resources.doge
import criptotracker.composeapp.generated.resources.dor
import criptotracker.composeapp.generated.resources.dot
import criptotracker.composeapp.generated.resources.drgn
import criptotracker.composeapp.generated.resources.drop
import criptotracker.composeapp.generated.resources.dta
import criptotracker.composeapp.generated.resources.dtr
import criptotracker.composeapp.generated.resources.dtx
import criptotracker.composeapp.generated.resources.dvf
import criptotracker.composeapp.generated.resources.dxd
import criptotracker.composeapp.generated.resources.dxt
import criptotracker.composeapp.generated.resources.edg
import criptotracker.composeapp.generated.resources.edo
import criptotracker.composeapp.generated.resources.efi
import criptotracker.composeapp.generated.resources.efx
import criptotracker.composeapp.generated.resources.egld
import criptotracker.composeapp.generated.resources.egt
import criptotracker.composeapp.generated.resources.ekg
import criptotracker.composeapp.generated.resources.ekt
import criptotracker.composeapp.generated.resources.ela
import criptotracker.composeapp.generated.resources.elec
import criptotracker.composeapp.generated.resources.elf
import criptotracker.composeapp.generated.resources.emc
import criptotracker.composeapp.generated.resources.emc2
import criptotracker.composeapp.generated.resources.eng
import criptotracker.composeapp.generated.resources.enj
import criptotracker.composeapp.generated.resources.eos
import criptotracker.composeapp.generated.resources.eosdac
import criptotracker.composeapp.generated.resources.ern
import criptotracker.composeapp.generated.resources.esd
import criptotracker.composeapp.generated.resources.esp
import criptotracker.composeapp.generated.resources.ess
import criptotracker.composeapp.generated.resources.etc
import criptotracker.composeapp.generated.resources.eth
import criptotracker.composeapp.generated.resources.etn
import criptotracker.composeapp.generated.resources.etp
import criptotracker.composeapp.generated.resources.etz
import criptotracker.composeapp.generated.resources.evx
import criptotracker.composeapp.generated.resources.ewt
import criptotracker.composeapp.generated.resources.exrn
import criptotracker.composeapp.generated.resources.exy
import criptotracker.composeapp.generated.resources.fab
import criptotracker.composeapp.generated.resources.fct
import criptotracker.composeapp.generated.resources.feed
import criptotracker.composeapp.generated.resources.fei
import criptotracker.composeapp.generated.resources.fet
import criptotracker.composeapp.generated.resources.fida
import criptotracker.composeapp.generated.resources.fil
import criptotracker.composeapp.generated.resources.filda
import criptotracker.composeapp.generated.resources.flow
import criptotracker.composeapp.generated.resources.fota
import criptotracker.composeapp.generated.resources.fox
import criptotracker.composeapp.generated.resources.frax
import criptotracker.composeapp.generated.resources.frm
import criptotracker.composeapp.generated.resources.front
import criptotracker.composeapp.generated.resources.fsn
import criptotracker.composeapp.generated.resources.ft
import criptotracker.composeapp.generated.resources.ftc
import criptotracker.composeapp.generated.resources.ftm
import criptotracker.composeapp.generated.resources.ftt
import criptotracker.composeapp.generated.resources.fuel
import criptotracker.composeapp.generated.resources.`fun`
import criptotracker.composeapp.generated.resources.fxc
import criptotracker.composeapp.generated.resources.fxt
import criptotracker.composeapp.generated.resources.gala
import criptotracker.composeapp.generated.resources.gdc
import criptotracker.composeapp.generated.resources.gem
import criptotracker.composeapp.generated.resources.gen
import criptotracker.composeapp.generated.resources.gno
import criptotracker.composeapp.generated.resources.gnt
import criptotracker.composeapp.generated.resources.gnx
import criptotracker.composeapp.generated.resources.go
import criptotracker.composeapp.generated.resources.goc
import criptotracker.composeapp.generated.resources.got
import criptotracker.composeapp.generated.resources.grin
import criptotracker.composeapp.generated.resources.grs
import criptotracker.composeapp.generated.resources.grt
import criptotracker.composeapp.generated.resources.gsc
import criptotracker.composeapp.generated.resources.gswap
import criptotracker.composeapp.generated.resources.gt
import criptotracker.composeapp.generated.resources.gtc
import criptotracker.composeapp.generated.resources.gto
import criptotracker.composeapp.generated.resources.gusd
import criptotracker.composeapp.generated.resources.gvt
import criptotracker.composeapp.generated.resources.gxs
import criptotracker.composeapp.generated.resources.hakka
import criptotracker.composeapp.generated.resources.hbar
import criptotracker.composeapp.generated.resources.hc
import criptotracker.composeapp.generated.resources.hedg
import criptotracker.composeapp.generated.resources.her
import criptotracker.composeapp.generated.resources.hex
import criptotracker.composeapp.generated.resources.high
import criptotracker.composeapp.generated.resources.hive
import criptotracker.composeapp.generated.resources.hnt
import criptotracker.composeapp.generated.resources.hot
import criptotracker.composeapp.generated.resources.hot_x
import criptotracker.composeapp.generated.resources.hpb
import criptotracker.composeapp.generated.resources.hsr
import criptotracker.composeapp.generated.resources.ht
import criptotracker.composeapp.generated.resources.hum
import criptotracker.composeapp.generated.resources.husd
import criptotracker.composeapp.generated.resources.hvn
import criptotracker.composeapp.generated.resources.hydro
import criptotracker.composeapp.generated.resources.hyn
import criptotracker.composeapp.generated.resources.hzn
import criptotracker.composeapp.generated.resources.ibat
import criptotracker.composeapp.generated.resources.icn
import criptotracker.composeapp.generated.resources.icp
import criptotracker.composeapp.generated.resources.icx
import criptotracker.composeapp.generated.resources.idai
import criptotracker.composeapp.generated.resources.idex
import criptotracker.composeapp.generated.resources.ieth
import criptotracker.composeapp.generated.resources.ignis
import criptotracker.composeapp.generated.resources.iknc
import criptotracker.composeapp.generated.resources.ilink
import criptotracker.composeapp.generated.resources.inb
import criptotracker.composeapp.generated.resources.ins
import criptotracker.composeapp.generated.resources.iost
import criptotracker.composeapp.generated.resources.iota
import criptotracker.composeapp.generated.resources.iotx
import criptotracker.composeapp.generated.resources.iq
import criptotracker.composeapp.generated.resources.irep
import criptotracker.composeapp.generated.resources.iris
import criptotracker.composeapp.generated.resources.isusd
import criptotracker.composeapp.generated.resources.iusdc
import criptotracker.composeapp.generated.resources.iwbtc
import criptotracker.composeapp.generated.resources.izrx
import criptotracker.composeapp.generated.resources.jnt
import criptotracker.composeapp.generated.resources.jst
import criptotracker.composeapp.generated.resources.juno
import criptotracker.composeapp.generated.resources.kava
import criptotracker.composeapp.generated.resources.kcs
import criptotracker.composeapp.generated.resources.kda
import criptotracker.composeapp.generated.resources.keep
import criptotracker.composeapp.generated.resources.key
import criptotracker.composeapp.generated.resources.kick
import criptotracker.composeapp.generated.resources.kin
import criptotracker.composeapp.generated.resources.klay
import criptotracker.composeapp.generated.resources.klv
import criptotracker.composeapp.generated.resources.kmd
import criptotracker.composeapp.generated.resources.knc
import criptotracker.composeapp.generated.resources.ksm
import criptotracker.composeapp.generated.resources.lamb
import criptotracker.composeapp.generated.resources.land
import criptotracker.composeapp.generated.resources.lba
import criptotracker.composeapp.generated.resources.lcx
import criptotracker.composeapp.generated.resources.ldo
import criptotracker.composeapp.generated.resources.lend
import criptotracker.composeapp.generated.resources.leo
import criptotracker.composeapp.generated.resources.link
import criptotracker.composeapp.generated.resources.lit
import criptotracker.composeapp.generated.resources.lky
import criptotracker.composeapp.generated.resources.ln
import criptotracker.composeapp.generated.resources.loki
import criptotracker.composeapp.generated.resources.lon
import criptotracker.composeapp.generated.resources.looks
import criptotracker.composeapp.generated.resources.loom
import criptotracker.composeapp.generated.resources.lpt
import criptotracker.composeapp.generated.resources.lqd
import criptotracker.composeapp.generated.resources.lqty
import criptotracker.composeapp.generated.resources.lrc
import criptotracker.composeapp.generated.resources.lsk
import criptotracker.composeapp.generated.resources.ltc
import criptotracker.composeapp.generated.resources.lto
import criptotracker.composeapp.generated.resources.lun
import criptotracker.composeapp.generated.resources.luna
import criptotracker.composeapp.generated.resources.lxt
import criptotracker.composeapp.generated.resources.lym
import criptotracker.composeapp.generated.resources.maha
import criptotracker.composeapp.generated.resources.maid
import criptotracker.composeapp.generated.resources.man
import criptotracker.composeapp.generated.resources.mana
import criptotracker.composeapp.generated.resources.math
import criptotracker.composeapp.generated.resources.matic
import criptotracker.composeapp.generated.resources.matter
import criptotracker.composeapp.generated.resources.mbc
import criptotracker.composeapp.generated.resources.mco
import criptotracker.composeapp.generated.resources.mcx
import criptotracker.composeapp.generated.resources.mda
import criptotracker.composeapp.generated.resources.mds
import criptotracker.composeapp.generated.resources.med
import criptotracker.composeapp.generated.resources.medx
import criptotracker.composeapp.generated.resources.met
import criptotracker.composeapp.generated.resources.mfg
import criptotracker.composeapp.generated.resources.mft
import criptotracker.composeapp.generated.resources.mim
import criptotracker.composeapp.generated.resources.mir
import criptotracker.composeapp.generated.resources.mith
import criptotracker.composeapp.generated.resources.mkr
import criptotracker.composeapp.generated.resources.mln
import criptotracker.composeapp.generated.resources.mngo
import criptotracker.composeapp.generated.resources.mod
import criptotracker.composeapp.generated.resources.mot
import criptotracker.composeapp.generated.resources.mpl
import criptotracker.composeapp.generated.resources.mta
import criptotracker.composeapp.generated.resources.mth
import criptotracker.composeapp.generated.resources.mtl
import criptotracker.composeapp.generated.resources.mtn
import criptotracker.composeapp.generated.resources.mvc
import criptotracker.composeapp.generated.resources.mvl
import criptotracker.composeapp.generated.resources.mvp
import criptotracker.composeapp.generated.resources.mwat
import criptotracker.composeapp.generated.resources.mwc
import criptotracker.composeapp.generated.resources.mxm
import criptotracker.composeapp.generated.resources.myb
import criptotracker.composeapp.generated.resources.nano
import criptotracker.composeapp.generated.resources.nas
import criptotracker.composeapp.generated.resources.nav
import criptotracker.composeapp.generated.resources.ncash
import criptotracker.composeapp.generated.resources.nct
import criptotracker.composeapp.generated.resources.near
import criptotracker.composeapp.generated.resources.nebl
import criptotracker.composeapp.generated.resources.nec
import criptotracker.composeapp.generated.resources.neo
import criptotracker.composeapp.generated.resources.nex
import criptotracker.composeapp.generated.resources.nexxo
import criptotracker.composeapp.generated.resources.nft
import criptotracker.composeapp.generated.resources.ngc
import criptotracker.composeapp.generated.resources.niox
import criptotracker.composeapp.generated.resources.nkn
import criptotracker.composeapp.generated.resources.nlg
import criptotracker.composeapp.generated.resources.nmr
import criptotracker.composeapp.generated.resources.noia
import criptotracker.composeapp.generated.resources.nper
import criptotracker.composeapp.generated.resources.npxs
import criptotracker.composeapp.generated.resources.nrg
import criptotracker.composeapp.generated.resources.nrve
import criptotracker.composeapp.generated.resources.nu
import criptotracker.composeapp.generated.resources.nuls
import criptotracker.composeapp.generated.resources.nxs
import criptotracker.composeapp.generated.resources.oag
import criptotracker.composeapp.generated.resources.oax
import criptotracker.composeapp.generated.resources.ocean
import criptotracker.composeapp.generated.resources.ocn
import criptotracker.composeapp.generated.resources.ode
import criptotracker.composeapp.generated.resources.ogn
import criptotracker.composeapp.generated.resources.ohm
import criptotracker.composeapp.generated.resources.okb
import criptotracker.composeapp.generated.resources.olt
import criptotracker.composeapp.generated.resources.omg
import criptotracker.composeapp.generated.resources.one
import criptotracker.composeapp.generated.resources.onion
import criptotracker.composeapp.generated.resources.ont
import criptotracker.composeapp.generated.resources.open
import criptotracker.composeapp.generated.resources.opium
import criptotracker.composeapp.generated.resources.orbs
import criptotracker.composeapp.generated.resources.orc
import criptotracker.composeapp.generated.resources.orn
import criptotracker.composeapp.generated.resources.osmo
import criptotracker.composeapp.generated.resources.ost
import criptotracker.composeapp.generated.resources.ovc
import criptotracker.composeapp.generated.resources.oxt
import criptotracker.composeapp.generated.resources.pai
import criptotracker.composeapp.generated.resources.paint
import criptotracker.composeapp.generated.resources.pal
import criptotracker.composeapp.generated.resources.par
import criptotracker.composeapp.generated.resources.part
import criptotracker.composeapp.generated.resources.pax
import criptotracker.composeapp.generated.resources.paxg
import criptotracker.composeapp.generated.resources.pay
import criptotracker.composeapp.generated.resources.pbr
import criptotracker.composeapp.generated.resources.pbtc
import criptotracker.composeapp.generated.resources.pendle
import criptotracker.composeapp.generated.resources.perl
import criptotracker.composeapp.generated.resources.perp
import criptotracker.composeapp.generated.resources.pickle
import criptotracker.composeapp.generated.resources.pivx
import criptotracker.composeapp.generated.resources.play
import criptotracker.composeapp.generated.resources.pldai
import criptotracker.composeapp.generated.resources.plr
import criptotracker.composeapp.generated.resources.plusdc
import criptotracker.composeapp.generated.resources.png
import criptotracker.composeapp.generated.resources.pnk
import criptotracker.composeapp.generated.resources.pnt
import criptotracker.composeapp.generated.resources.poa
import criptotracker.composeapp.generated.resources.poe
import criptotracker.composeapp.generated.resources.pokt
import criptotracker.composeapp.generated.resources.pols
import criptotracker.composeapp.generated.resources.poly
import criptotracker.composeapp.generated.resources.pond
import criptotracker.composeapp.generated.resources.pool
import criptotracker.composeapp.generated.resources.powr
import criptotracker.composeapp.generated.resources.ppay
import criptotracker.composeapp.generated.resources.ppc
import criptotracker.composeapp.generated.resources.ppp
import criptotracker.composeapp.generated.resources.ppt
import criptotracker.composeapp.generated.resources.pre
import criptotracker.composeapp.generated.resources.premia
import criptotracker.composeapp.generated.resources.prl
import criptotracker.composeapp.generated.resources.pro
import criptotracker.composeapp.generated.resources.pros
import criptotracker.composeapp.generated.resources.prq
import criptotracker.composeapp.generated.resources.pst
import criptotracker.composeapp.generated.resources.qash
import criptotracker.composeapp.generated.resources.qbit
import criptotracker.composeapp.generated.resources.qi
import criptotracker.composeapp.generated.resources.qkc
import criptotracker.composeapp.generated.resources.qlc
import criptotracker.composeapp.generated.resources.qnt
import criptotracker.composeapp.generated.resources.qsp
import criptotracker.composeapp.generated.resources.qtum
import criptotracker.composeapp.generated.resources.quick
import criptotracker.composeapp.generated.resources.r
import criptotracker.composeapp.generated.resources.rae
import criptotracker.composeapp.generated.resources.rari
import criptotracker.composeapp.generated.resources.ray
import criptotracker.composeapp.generated.resources.rcn
import criptotracker.composeapp.generated.resources.rdd
import criptotracker.composeapp.generated.resources.rdn
import criptotracker.composeapp.generated.resources.ren
import criptotracker.composeapp.generated.resources.rep
import criptotracker.composeapp.generated.resources.req
import criptotracker.composeapp.generated.resources.resource_new
import criptotracker.composeapp.generated.resources.resource_super
import criptotracker.composeapp.generated.resources.rev
import criptotracker.composeapp.generated.resources.rfox
import criptotracker.composeapp.generated.resources.rhoc
import criptotracker.composeapp.generated.resources.rif
import criptotracker.composeapp.generated.resources.rlc
import criptotracker.composeapp.generated.resources.rook
import criptotracker.composeapp.generated.resources.rose
import criptotracker.composeapp.generated.resources.rpx
import criptotracker.composeapp.generated.resources.rsr
import criptotracker.composeapp.generated.resources.rsv
import criptotracker.composeapp.generated.resources.rune
import criptotracker.composeapp.generated.resources.rvn
import criptotracker.composeapp.generated.resources.s
import criptotracker.composeapp.generated.resources.sai
import criptotracker.composeapp.generated.resources.salt
import criptotracker.composeapp.generated.resources.san
import criptotracker.composeapp.generated.resources.sand
import criptotracker.composeapp.generated.resources.sar
import criptotracker.composeapp.generated.resources.scrl
import criptotracker.composeapp.generated.resources.scrt
import criptotracker.composeapp.generated.resources.sdt
import criptotracker.composeapp.generated.resources.seele
import criptotracker.composeapp.generated.resources.sefi
import criptotracker.composeapp.generated.resources.sem
import criptotracker.composeapp.generated.resources.sfi
import criptotracker.composeapp.generated.resources.sfp
import criptotracker.composeapp.generated.resources.shib
import criptotracker.composeapp.generated.resources.shr
import criptotracker.composeapp.generated.resources.shuf
import criptotracker.composeapp.generated.resources.sia
import criptotracker.composeapp.generated.resources.skl
import criptotracker.composeapp.generated.resources.sky
import criptotracker.composeapp.generated.resources.slt
import criptotracker.composeapp.generated.resources.smart
import criptotracker.composeapp.generated.resources.snc
import criptotracker.composeapp.generated.resources.sngls
import criptotracker.composeapp.generated.resources.snm
import criptotracker.composeapp.generated.resources.snt
import criptotracker.composeapp.generated.resources.snx
import criptotracker.composeapp.generated.resources.sol
import criptotracker.composeapp.generated.resources.soul
import criptotracker.composeapp.generated.resources.sov
import criptotracker.composeapp.generated.resources.spn
import criptotracker.composeapp.generated.resources.srm
import criptotracker.composeapp.generated.resources.stake
import criptotracker.composeapp.generated.resources.steem
import criptotracker.composeapp.generated.resources.step
import criptotracker.composeapp.generated.resources.steth
import criptotracker.composeapp.generated.resources.stmx
import criptotracker.composeapp.generated.resources.storj
import criptotracker.composeapp.generated.resources.storm
import criptotracker.composeapp.generated.resources.stpt
import criptotracker.composeapp.generated.resources.strat
import criptotracker.composeapp.generated.resources.stx
import criptotracker.composeapp.generated.resources.sub
import criptotracker.composeapp.generated.resources.suqa
import criptotracker.composeapp.generated.resources.sushi
import criptotracker.composeapp.generated.resources.suter
import criptotracker.composeapp.generated.resources.swap
import criptotracker.composeapp.generated.resources.swth
import criptotracker.composeapp.generated.resources.sxdt
import criptotracker.composeapp.generated.resources.sxp
import criptotracker.composeapp.generated.resources.sys
import criptotracker.composeapp.generated.resources.tbtc
import criptotracker.composeapp.generated.resources.tct
import criptotracker.composeapp.generated.resources.tel
import criptotracker.composeapp.generated.resources.tfuel
import criptotracker.composeapp.generated.resources.thc
import criptotracker.composeapp.generated.resources.theta
import criptotracker.composeapp.generated.resources.thr
import criptotracker.composeapp.generated.resources.tio
import criptotracker.composeapp.generated.resources.titan
import criptotracker.composeapp.generated.resources.tkn
import criptotracker.composeapp.generated.resources.tky
import criptotracker.composeapp.generated.resources.tnb
import criptotracker.composeapp.generated.resources.tnc
import criptotracker.composeapp.generated.resources.tnt
import criptotracker.composeapp.generated.resources.tomo
import criptotracker.composeapp.generated.resources.torn
import criptotracker.composeapp.generated.resources.tpay
import criptotracker.composeapp.generated.resources.trac
import criptotracker.composeapp.generated.resources.trb
import criptotracker.composeapp.generated.resources.tribe
import criptotracker.composeapp.generated.resources.trig
import criptotracker.composeapp.generated.resources.trtl
import criptotracker.composeapp.generated.resources.tru
import criptotracker.composeapp.generated.resources.trx
import criptotracker.composeapp.generated.resources.tryb
import criptotracker.composeapp.generated.resources.tube
import criptotracker.composeapp.generated.resources.tusd
import criptotracker.composeapp.generated.resources.twt
import criptotracker.composeapp.generated.resources.ubq
import criptotracker.composeapp.generated.resources.ubt
import criptotracker.composeapp.generated.resources.uft
import criptotracker.composeapp.generated.resources.ult
import criptotracker.composeapp.generated.resources.uma
import criptotracker.composeapp.generated.resources.uncx
import criptotracker.composeapp.generated.resources.unfi
import criptotracker.composeapp.generated.resources.uni
import criptotracker.composeapp.generated.resources.unn
import criptotracker.composeapp.generated.resources.uos
import criptotracker.composeapp.generated.resources.upp
import criptotracker.composeapp.generated.resources.usdc
import criptotracker.composeapp.generated.resources.usdp
import criptotracker.composeapp.generated.resources.usds
import criptotracker.composeapp.generated.resources.usdt
import criptotracker.composeapp.generated.resources.utk
import criptotracker.composeapp.generated.resources.uuu
import criptotracker.composeapp.generated.resources.value
import criptotracker.composeapp.generated.resources.veri
import criptotracker.composeapp.generated.resources.vest
import criptotracker.composeapp.generated.resources.vet
import criptotracker.composeapp.generated.resources.vgx
import criptotracker.composeapp.generated.resources.via
import criptotracker.composeapp.generated.resources.vib
import criptotracker.composeapp.generated.resources.vibe
import criptotracker.composeapp.generated.resources.vidt
import criptotracker.composeapp.generated.resources.vikky
import criptotracker.composeapp.generated.resources.vin
import criptotracker.composeapp.generated.resources.vite
import criptotracker.composeapp.generated.resources.viu
import criptotracker.composeapp.generated.resources.vlx
import criptotracker.composeapp.generated.resources.vrs
import criptotracker.composeapp.generated.resources.vsp
import criptotracker.composeapp.generated.resources.vsys
import criptotracker.composeapp.generated.resources.vtc
import criptotracker.composeapp.generated.resources.wabi
import criptotracker.composeapp.generated.resources.wan
import criptotracker.composeapp.generated.resources.waves
import criptotracker.composeapp.generated.resources.wbtc
import criptotracker.composeapp.generated.resources.wct
import criptotracker.composeapp.generated.resources.wexpoly
import criptotracker.composeapp.generated.resources.whale
import criptotracker.composeapp.generated.resources.wib
import criptotracker.composeapp.generated.resources.wing
import criptotracker.composeapp.generated.resources.wings
import criptotracker.composeapp.generated.resources.woo
import criptotracker.composeapp.generated.resources.wpr
import criptotracker.composeapp.generated.resources.wrx
import criptotracker.composeapp.generated.resources.wtc
import criptotracker.composeapp.generated.resources.wxt
import criptotracker.composeapp.generated.resources.xas
import criptotracker.composeapp.generated.resources.xchf
import criptotracker.composeapp.generated.resources.xem
import criptotracker.composeapp.generated.resources.xhv
import criptotracker.composeapp.generated.resources.xin
import criptotracker.composeapp.generated.resources.xlm
import criptotracker.composeapp.generated.resources.xlq
import criptotracker.composeapp.generated.resources.xmark
import criptotracker.composeapp.generated.resources.xmr
import criptotracker.composeapp.generated.resources.xmx
import criptotracker.composeapp.generated.resources.xnk
import criptotracker.composeapp.generated.resources.xns
import criptotracker.composeapp.generated.resources.xor
import criptotracker.composeapp.generated.resources.xrd
import criptotracker.composeapp.generated.resources.xrp
import criptotracker.composeapp.generated.resources.xsn
import criptotracker.composeapp.generated.resources.xsr
import criptotracker.composeapp.generated.resources.xtz
import criptotracker.composeapp.generated.resources.xvg
import criptotracker.composeapp.generated.resources.xyo
import criptotracker.composeapp.generated.resources.xzc
import criptotracker.composeapp.generated.resources.yfi
import criptotracker.composeapp.generated.resources.yoyo
import criptotracker.composeapp.generated.resources.zai
import criptotracker.composeapp.generated.resources.zb
import criptotracker.composeapp.generated.resources.zco
import criptotracker.composeapp.generated.resources.zec
import criptotracker.composeapp.generated.resources.zen
import criptotracker.composeapp.generated.resources.zil
import criptotracker.composeapp.generated.resources.zks
import criptotracker.composeapp.generated.resources.zrx
import criptotracker.composeapp.generated.resources.question_sign
import org.jetbrains.compose.resources.painterResource

@Composable
fun getDrawableIdForCoin(symbol: String): Painter {
    return when (symbol.uppercase()) {
        "1INCH" -> painterResource(Res.drawable._inch)
        "ST" -> painterResource(Res.drawable._st)
        "XBTC" -> painterResource(Res.drawable._xbtc)
        "AAVE" -> painterResource(Res.drawable.aave)
        "ABBC" -> painterResource(Res.drawable.abbc)
        "ABT" -> painterResource(Res.drawable.abt)
        "AC3" -> painterResource(Res.drawable.ac3)
        "ACT" -> painterResource(Res.drawable.act)
        "ADA" -> painterResource(Res.drawable.ada)
        "ADB" -> painterResource(Res.drawable.adb)
        "ADX" -> painterResource(Res.drawable.adx)
        "AE" -> painterResource(Res.drawable.ae)
        "AEON" -> painterResource(Res.drawable.aeon)
        "AERGO" -> painterResource(Res.drawable.aergo)
        "AGI" -> painterResource(Res.drawable.agi)
        "AION" -> painterResource(Res.drawable.aion)
        "AIT" -> painterResource(Res.drawable.ait)
        "AKRO" -> painterResource(Res.drawable.akro)
        "AKT" -> painterResource(Res.drawable.akt)
        "ALCX" -> painterResource(Res.drawable.alcx)
        "ALEPH" -> painterResource(Res.drawable.aleph)
        "ALGO" -> painterResource(Res.drawable.algo)
        "ALIS" -> painterResource(Res.drawable.alis)
        "ALPHA" -> painterResource(Res.drawable.alpha)
        "ALX" -> painterResource(Res.drawable.alx)
        "AMB" -> painterResource(Res.drawable.amb)
        "AMLT" -> painterResource(Res.drawable.amlt)
        "AMP" -> painterResource(Res.drawable.amp)
        "AMPL" -> painterResource(Res.drawable.ampl)
        "ANC" -> painterResource(Res.drawable.anc)
        "ANJ" -> painterResource(Res.drawable.anj)
        "ANKR" -> painterResource(Res.drawable.ankr)
        "ANT" -> painterResource(Res.drawable.ant)
        "APH" -> painterResource(Res.drawable.aph)
        "APL" -> painterResource(Res.drawable.apl)
        "APPC" -> painterResource(Res.drawable.appc)
        "APW" -> painterResource(Res.drawable.apw)
        "APY" -> painterResource(Res.drawable.apy)
        "AR" -> painterResource(Res.drawable.ar)
        "ARDR" -> painterResource(Res.drawable.ardr)
        "ARK" -> painterResource(Res.drawable.ark)
        "ARMOR" -> painterResource(Res.drawable.armor)
        "ARN" -> painterResource(Res.drawable.arn)
        "ARO" -> painterResource(Res.drawable.aro)
        "ARRR" -> painterResource(Res.drawable.arrr)
        "AST" -> painterResource(Res.drawable.ast)
        "ATMI" -> painterResource(Res.drawable.atmi)
        "ATOM" -> painterResource(Res.drawable.atom)
        "AUC" -> painterResource(Res.drawable.auc)
        "AURA" -> painterResource(Res.drawable.aura)
        "AUTO" -> painterResource(Res.drawable.auto)
        "AVAX" -> painterResource(Res.drawable.avax)
        "AWC" -> painterResource(Res.drawable.awc)
        "AXP" -> painterResource(Res.drawable.axp)
        "BAC" -> painterResource(Res.drawable.bac)
        "BAL" -> painterResource(Res.drawable.bal)
        "BAND" -> painterResource(Res.drawable.band)
        "BAO" -> painterResource(Res.drawable.bao)
        "BAT" -> painterResource(Res.drawable.bat)
        "BAY" -> painterResource(Res.drawable.bay)
        "BBR" -> painterResource(Res.drawable.bbr)
        "BCD" -> painterResource(Res.drawable.bcd)
        "BCH" -> painterResource(Res.drawable.bch)
        "BCHA" -> painterResource(Res.drawable.bcha)
        "BCN" -> painterResource(Res.drawable.bcn)
        "BCO" -> painterResource(Res.drawable.bco)
        "BEL" -> painterResource(Res.drawable.bel)
        "BETA" -> painterResource(Res.drawable.beta)
        "BF" -> painterResource(Res.drawable.bf)
        "BIFI" -> painterResource(Res.drawable.bifi)
        "BIX" -> painterResource(Res.drawable.bix)
        "BLK" -> painterResource(Res.drawable.blk)
        "BLOCK" -> painterResource(Res.drawable.block)
        "BLT" -> painterResource(Res.drawable.blt)
        "BLUE" -> painterResource(Res.drawable.blue)
        "BLZ" -> painterResource(Res.drawable.blz)
        "BNB" -> painterResource(Res.drawable.bnb)
        "BNT" -> painterResource(Res.drawable.bnt)
        "BOND" -> painterResource(Res.drawable.bond)
        "BONDLY" -> painterResource(Res.drawable.bondly)
        "BORA" -> painterResource(Res.drawable.bora)
        "BOX" -> painterResource(Res.drawable.box)
        "BPT" -> painterResource(Res.drawable.bpt)
        "BRD" -> painterResource(Res.drawable.brd)
        "BTC" -> painterResource(Res.drawable.btc)
        "BTC_" -> painterResource(Res.drawable.btc__)
        "BTCP" -> painterResource(Res.drawable.btcp)
        "BTG" -> painterResource(Res.drawable.btg)
        "BTMX" -> painterResource(Res.drawable.btmx)
        "BTO" -> painterResource(Res.drawable.bto)
        "BTS" -> painterResource(Res.drawable.bts)
        "BTT" -> painterResource(Res.drawable.btt)
        "BTU" -> painterResource(Res.drawable.btu)
        "BU" -> painterResource(Res.drawable.bu)
        "BUNNY" -> painterResource(Res.drawable.bunny)
        "BUSD" -> painterResource(Res.drawable.busd)
        "BWT" -> painterResource(Res.drawable.bwt)
        "BZ" -> painterResource(Res.drawable.bz)
        "BZNT" -> painterResource(Res.drawable.bznt)
        "BZRX" -> painterResource(Res.drawable.bzrx)
        "C20" -> painterResource(Res.drawable.c20)
        "C98" -> painterResource(Res.drawable.c98)
        "CAKE" -> painterResource(Res.drawable.cake)
        "CAPP" -> painterResource(Res.drawable.capp)
        "CAR" -> painterResource(Res.drawable.car)
        "CARD" -> painterResource(Res.drawable.card)
        "CBAT" -> painterResource(Res.drawable.cbat)
        "CBT" -> painterResource(Res.drawable.cbt)
        "CDAI" -> painterResource(Res.drawable.cdai)
        "CDT" -> painterResource(Res.drawable.cdt)
        "CEL" -> painterResource(Res.drawable.cel)
        "CELO" -> painterResource(Res.drawable.celo)
        "CELR" -> painterResource(Res.drawable.celr)
        "CENNZ" -> painterResource(Res.drawable.cennz)
        "CETH" -> painterResource(Res.drawable.ceth)
        "CFX" -> painterResource(Res.drawable.cfx)
        "CHAI" -> painterResource(Res.drawable.chai)
        "CHAT" -> painterResource(Res.drawable.chat)
        "CHSB" -> painterResource(Res.drawable.chsb)
        "CHZ" -> painterResource(Res.drawable.chz)
        "CKB" -> painterResource(Res.drawable.ckb)
        "CLO" -> painterResource(Res.drawable.clo)
        "CLOAK" -> painterResource(Res.drawable.cloak)
        "CLOUT" -> painterResource(Res.drawable.clout)
        "CMT" -> painterResource(Res.drawable.cmt)
        "CND" -> painterResource(Res.drawable.cnd)
        "CNX" -> painterResource(Res.drawable.cnx)
        "COMP" -> painterResource(Res.drawable.comp)
        "CONI" -> painterResource(Res.drawable.coni)
        "COSM" -> painterResource(Res.drawable.cosm)
        "COTI" -> painterResource(Res.drawable.coti)
        "COV" -> painterResource(Res.drawable.cov)
        "COVA" -> painterResource(Res.drawable.cova)
        "COVER" -> painterResource(Res.drawable.cover)
        "CPC" -> painterResource(Res.drawable.cpc)
        "CRE" -> painterResource(Res.drawable.cre)
        "CREAM" -> painterResource(Res.drawable.cream)
        "CRED" -> painterResource(Res.drawable.cred)
        "CREP" -> painterResource(Res.drawable.crep)
        "CRO" -> painterResource(Res.drawable.cro)
        "CRPT" -> painterResource(Res.drawable.crpt)
        "CRV" -> painterResource(Res.drawable.crv)
        "CS" -> painterResource(Res.drawable.cs)
        "CSAI" -> painterResource(Res.drawable.csai)
        "CSC" -> painterResource(Res.drawable.csc)
        "CTC" -> painterResource(Res.drawable.ctc)
        "CTXC" -> painterResource(Res.drawable.ctxc)
        "CUSDC" -> painterResource(Res.drawable.cusdc)
        "CV" -> painterResource(Res.drawable.cv)
        "CVC" -> painterResource(Res.drawable.cvc)
        "CVP" -> painterResource(Res.drawable.cvp)
        "CVT" -> painterResource(Res.drawable.cvt)
        "CVX" -> painterResource(Res.drawable.cvx)
        "CWBTC" -> painterResource(Res.drawable.cwbtc)
        "CZR" -> painterResource(Res.drawable.czrx)
        "DADI" -> painterResource(Res.drawable.dadi)
        "DAFI" -> painterResource(Res.drawable.dafi)
        "DAG" -> painterResource(Res.drawable.dag)
        "DAI" -> painterResource(Res.drawable.dai)
        "DASH" -> painterResource(Res.drawable.dash)
        "DAT" -> painterResource(Res.drawable.dat)
        "DATA" -> painterResource(Res.drawable.data)
        "DATX" -> painterResource(Res.drawable.datx)
        "DBC" -> painterResource(Res.drawable.dbc)
        "DCN" -> painterResource(Res.drawable.dcn)
        "DCR" -> painterResource(Res.drawable.dcr)
        "DCT" -> painterResource(Res.drawable.dct)
        "DDD" -> painterResource(Res.drawable.ddd)
        "DENT" -> painterResource(Res.drawable.dent)
        "DERI" -> painterResource(Res.drawable.deri)
        "DFI" -> painterResource(Res.drawable.dfi)
        "DFT" -> painterResource(Res.drawable.dft)
        "DFYN" -> painterResource(Res.drawable.dfyn)
        "DGB" -> painterResource(Res.drawable.dgb)
        "DGD" -> painterResource(Res.drawable.dgd)
        "DGTX" -> painterResource(Res.drawable.dgtx)
        "DIVI" -> painterResource(Res.drawable.divi)
        "DLT" -> painterResource(Res.drawable.dlt)
        "DMT" -> painterResource(Res.drawable.dmt)
        "DNT" -> painterResource(Res.drawable.dnt)
        "DOCK" -> painterResource(Res.drawable.dock)
        "DODO" -> painterResource(Res.drawable.dodo)
        "DOGE" -> painterResource(Res.drawable.doge)
        "DOR" -> painterResource(Res.drawable.dor)
        "DOT" -> painterResource(Res.drawable.dot)
        "DRGN" -> painterResource(Res.drawable.drgn)
        "DROP" -> painterResource(Res.drawable.drop)
        "DTA" -> painterResource(Res.drawable.dta)
        "DTR" -> painterResource(Res.drawable.dtr)
        "DTX" -> painterResource(Res.drawable.dtx)
        "DVF" -> painterResource(Res.drawable.dvf)
        "DXD" -> painterResource(Res.drawable.dxd)
        "DXT" -> painterResource(Res.drawable.dxt)
        "EDG" -> painterResource(Res.drawable.edg)
        "EDO" -> painterResource(Res.drawable.edo)
        "EFI" -> painterResource(Res.drawable.efi)
        "EFX" -> painterResource(Res.drawable.efx)
        "EGLD" -> painterResource(Res.drawable.egld)
        "EGT" -> painterResource(Res.drawable.egt)
        "EKG" -> painterResource(Res.drawable.ekg)
        "EKT" -> painterResource(Res.drawable.ekt)
        "ELA" -> painterResource(Res.drawable.ela)
        "ELEC" -> painterResource(Res.drawable.elec)
        "ELF" -> painterResource(Res.drawable.elf)
        "EMC" -> painterResource(Res.drawable.emc)
        "EMC2" -> painterResource(Res.drawable.emc2)
        "ENG" -> painterResource(Res.drawable.eng)
        "ENJ" -> painterResource(Res.drawable.enj)
        "EOS" -> painterResource(Res.drawable.eos)
        "EOSDAC" -> painterResource(Res.drawable.eosdac)
        "ERN" -> painterResource(Res.drawable.ern)
        "ESD" -> painterResource(Res.drawable.esd)
        "ESP" -> painterResource(Res.drawable.esp)
        "ESS" -> painterResource(Res.drawable.ess)
        "ETC" -> painterResource(Res.drawable.etc)
        "ETH" -> painterResource(Res.drawable.eth)
        "ETN" -> painterResource(Res.drawable.etn)
        "ETP" -> painterResource(Res.drawable.etp)
        "ETZ" -> painterResource(Res.drawable.etz)
        "EVX" -> painterResource(Res.drawable.evx)
        "EWT" -> painterResource(Res.drawable.ewt)
        "EXRN" -> painterResource(Res.drawable.exrn)
        "EXY" -> painterResource(Res.drawable.exy)
        "FAB" -> painterResource(Res.drawable.fab)
        "FCT" -> painterResource(Res.drawable.fct)
        "FEED" -> painterResource(Res.drawable.feed)
        "FEI" -> painterResource(Res.drawable.fei)
        "FET" -> painterResource(Res.drawable.fet)
        "FIDA" -> painterResource(Res.drawable.fida)
        "FIL" -> painterResource(Res.drawable.fil)
        "FILDA" -> painterResource(Res.drawable.filda)
        "FLOW" -> painterResource(Res.drawable.flow)
        "FOTA" -> painterResource(Res.drawable.fota)
        "FOX" -> painterResource(Res.drawable.fox)
        "FRAX" -> painterResource(Res.drawable.frax)
        "FRM" -> painterResource(Res.drawable.frm)
        "FRONT" -> painterResource(Res.drawable.front)
        "FSN" -> painterResource(Res.drawable.fsn)
        "FT" -> painterResource(Res.drawable.ft)
        "FTC" -> painterResource(Res.drawable.ftc)
        "FTM" -> painterResource(Res.drawable.ftm)
        "FTT" -> painterResource(Res.drawable.ftt)
        "FUEL" -> painterResource(Res.drawable.fuel)
        "FUN" -> painterResource(Res.drawable.`fun`)
        "FXC" -> painterResource(Res.drawable.fxc)
        "FXT" -> painterResource(Res.drawable.fxt)
        "GALA" -> painterResource(Res.drawable.gala)
        "GDC" -> painterResource(Res.drawable.gdc)
        "GEM" -> painterResource(Res.drawable.gem)
        "GEN" -> painterResource(Res.drawable.gen)
        "GNO" -> painterResource(Res.drawable.gno)
        "GNT" -> painterResource(Res.drawable.gnt)
        "GNX" -> painterResource(Res.drawable.gnx)
        "GO" -> painterResource(Res.drawable.go)
        "GOC" -> painterResource(Res.drawable.goc)
        "GOT" -> painterResource(Res.drawable.got)
        "GRIN" -> painterResource(Res.drawable.grin)
        "GRS" -> painterResource(Res.drawable.grs)
        "GRT" -> painterResource(Res.drawable.grt)
        "GSC" -> painterResource(Res.drawable.gsc)
        "GSWAP" -> painterResource(Res.drawable.gswap)
        "GT" -> painterResource(Res.drawable.gt)
        "GTC" -> painterResource(Res.drawable.gtc)
        "GTO" -> painterResource(Res.drawable.gto)
        "GUSD" -> painterResource(Res.drawable.gusd)
        "GVT" -> painterResource(Res.drawable.gvt)
        "GXS" -> painterResource(Res.drawable.gxs)
        "HAKKA" -> painterResource(Res.drawable.hakka)
        "HBAR" -> painterResource(Res.drawable.hbar)
        "HC" -> painterResource(Res.drawable.hc)
        "HEDG" -> painterResource(Res.drawable.hedg)
        "HER" -> painterResource(Res.drawable.her)
        "HEX" -> painterResource(Res.drawable.hex)
        "HIGH" -> painterResource(Res.drawable.high)
        "HIVE" -> painterResource(Res.drawable.hive)
        "HNT" -> painterResource(Res.drawable.hnt)
        "HOT" -> painterResource(Res.drawable.hot)
        "HOT_X" -> painterResource(Res.drawable.hot_x)
        "HPB" -> painterResource(Res.drawable.hpb)
        "HSR" -> painterResource(Res.drawable.hsr)
        "HT" -> painterResource(Res.drawable.ht)
        "HUM" -> painterResource(Res.drawable.hum)
        "HUSD" -> painterResource(Res.drawable.husd)
        "HVN" -> painterResource(Res.drawable.hvn)
        "HYDRO" -> painterResource(Res.drawable.hydro)
        "HYN" -> painterResource(Res.drawable.hyn)
        "HZN" -> painterResource(Res.drawable.hzn)
        "IBAT" -> painterResource(Res.drawable.ibat)
        "ICN" -> painterResource(Res.drawable.icn)
        "ICP" -> painterResource(Res.drawable.icp)
        "ICX" -> painterResource(Res.drawable.icx)
        "IDAI" -> painterResource(Res.drawable.idai)
        "IDEX" -> painterResource(Res.drawable.idex)
        "IETH" -> painterResource(Res.drawable.ieth)
        "IGNIS" -> painterResource(Res.drawable.ignis)
        "IKNC" -> painterResource(Res.drawable.iknc)
        "ILINK" -> painterResource(Res.drawable.ilink)
        "INB" -> painterResource(Res.drawable.inb)
        "INS" -> painterResource(Res.drawable.ins)
        "IOST" -> painterResource(Res.drawable.iost)
        "IOTA" -> painterResource(Res.drawable.iota)
        "IOTX" -> painterResource(Res.drawable.iotx)
        "IQ" -> painterResource(Res.drawable.iq)
        "IREP" -> painterResource(Res.drawable.irep)
        "IRIS" -> painterResource(Res.drawable.iris)
        "ISUSD" -> painterResource(Res.drawable.isusd)
        "IUSDC" -> painterResource(Res.drawable.iusdc)
        "IWBTC" -> painterResource(Res.drawable.iwbtc)
        "IZRX" -> painterResource(Res.drawable.izrx)
        "JNT" -> painterResource(Res.drawable.jnt)
        "JST" -> painterResource(Res.drawable.jst)
        "JUNO" -> painterResource(Res.drawable.juno)
        "KAVA" -> painterResource(Res.drawable.kava)
        "KCS" -> painterResource(Res.drawable.kcs)
        "KDA" -> painterResource(Res.drawable.kda)
        "KEEP" -> painterResource(Res.drawable.keep)
        "KEY" -> painterResource(Res.drawable.key)
        "KICK" -> painterResource(Res.drawable.kick)
        "KIN" -> painterResource(Res.drawable.kin)
        "KLAY" -> painterResource(Res.drawable.klay)
        "KLV" -> painterResource(Res.drawable.klv)
        "KMD" -> painterResource(Res.drawable.kmd)
        "KNC" -> painterResource(Res.drawable.knc)
        "KSM" -> painterResource(Res.drawable.ksm)
        "LAMB" -> painterResource(Res.drawable.lamb)
        "LAND" -> painterResource(Res.drawable.land)
        "LBA" -> painterResource(Res.drawable.lba)
        "LCX" -> painterResource(Res.drawable.lcx)
        "LDO" -> painterResource(Res.drawable.ldo)
        "LEND" -> painterResource(Res.drawable.lend)
        "LEO" -> painterResource(Res.drawable.leo)
        "LINK" -> painterResource(Res.drawable.link)
        "LIT" -> painterResource(Res.drawable.lit)
        "LKY" -> painterResource(Res.drawable.lky)
        "LN" -> painterResource(Res.drawable.ln)
        "LOKI" -> painterResource(Res.drawable.loki)
        "LON" -> painterResource(Res.drawable.lon)
        "LOOKS" -> painterResource(Res.drawable.looks)
        "LOOM" -> painterResource(Res.drawable.loom)
        "LPT" -> painterResource(Res.drawable.lpt)
        "LQD" -> painterResource(Res.drawable.lqd)
        "LQTY" -> painterResource(Res.drawable.lqty)
        "LRC" -> painterResource(Res.drawable.lrc)
        "LSK" -> painterResource(Res.drawable.lsk)
        "LTC" -> painterResource(Res.drawable.ltc)
        "LTO" -> painterResource(Res.drawable.lto)
        "LUN" -> painterResource(Res.drawable.lun)
        "LUNA" -> painterResource(Res.drawable.luna)
        "LXT" -> painterResource(Res.drawable.lxt)
        "LYM" -> painterResource(Res.drawable.lym)
        "MAHA" -> painterResource(Res.drawable.maha)
        "MAID" -> painterResource(Res.drawable.maid)
        "MAN" -> painterResource(Res.drawable.man)
        "MANA" -> painterResource(Res.drawable.mana)
        "MATH" -> painterResource(Res.drawable.math)
        "MATIC" -> painterResource(Res.drawable.matic)
        "MATTER" -> painterResource(Res.drawable.matter)
        "MBC" -> painterResource(Res.drawable.mbc)
        "MCO" -> painterResource(Res.drawable.mco)
        "MCX" -> painterResource(Res.drawable.mcx)
        "MDA" -> painterResource(Res.drawable.mda)
        "MDS" -> painterResource(Res.drawable.mds)
        "MED" -> painterResource(Res.drawable.med)
        "MEDX" -> painterResource(Res.drawable.medx)
        "MET" -> painterResource(Res.drawable.met)
        "MFG" -> painterResource(Res.drawable.mfg)
        "MFT" -> painterResource(Res.drawable.mft)
        "MIM" -> painterResource(Res.drawable.mim)
        "MIR" -> painterResource(Res.drawable.mir)
        "MITH" -> painterResource(Res.drawable.mith)
        "MKR" -> painterResource(Res.drawable.mkr)
        "MLN" -> painterResource(Res.drawable.mln)
        "MNGO" -> painterResource(Res.drawable.mngo)
        "MOD" -> painterResource(Res.drawable.mod)
        "MOT" -> painterResource(Res.drawable.mot)
        "MPL" -> painterResource(Res.drawable.mpl)
        "MTA" -> painterResource(Res.drawable.mta)
        "MTH" -> painterResource(Res.drawable.mth)
        "MTL" -> painterResource(Res.drawable.mtl)
        "MTN" -> painterResource(Res.drawable.mtn)
        "MVC" -> painterResource(Res.drawable.mvc)
        "MVL" -> painterResource(Res.drawable.mvl)
        "MVP" -> painterResource(Res.drawable.mvp)
        "MWAT" -> painterResource(Res.drawable.mwat)
        "MWC" -> painterResource(Res.drawable.mwc)
        "MXM" -> painterResource(Res.drawable.mxm)
        "MYB" -> painterResource(Res.drawable.myb)
        "NANO" -> painterResource(Res.drawable.nano)
        "NAS" -> painterResource(Res.drawable.nas)
        "NAV" -> painterResource(Res.drawable.nav)
        "NCASH" -> painterResource(Res.drawable.ncash)
        "NCT" -> painterResource(Res.drawable.nct)
        "NEAR" -> painterResource(Res.drawable.near)
        "NEBL" -> painterResource(Res.drawable.nebl)
        "NEC" -> painterResource(Res.drawable.nec)
        "NEO" -> painterResource(Res.drawable.neo)
        "NEX" -> painterResource(Res.drawable.nex)
        "NEXXO" -> painterResource(Res.drawable.nexxo)
        "NFT" -> painterResource(Res.drawable.nft)
        "NGC" -> painterResource(Res.drawable.ngc)
        "NIOX" -> painterResource(Res.drawable.niox)
        "NKN" -> painterResource(Res.drawable.nkn)
        "NLG" -> painterResource(Res.drawable.nlg)
        "NMR" -> painterResource(Res.drawable.nmr)
        "NOIA" -> painterResource(Res.drawable.noia)
        "NPER" -> painterResource(Res.drawable.nper)
        "NPXS" -> painterResource(Res.drawable.npxs)
        "NRG" -> painterResource(Res.drawable.nrg)
        "NRVE" -> painterResource(Res.drawable.nrve)
        "NU" -> painterResource(Res.drawable.nu)
        "NULS" -> painterResource(Res.drawable.nuls)
        "NXS" -> painterResource(Res.drawable.nxs)
        "OAG" -> painterResource(Res.drawable.oag)
        "OAX" -> painterResource(Res.drawable.oax)
        "OCEAN" -> painterResource(Res.drawable.ocean)
        "OCN" -> painterResource(Res.drawable.ocn)
        "ODE" -> painterResource(Res.drawable.ode)
        "OGN" -> painterResource(Res.drawable.ogn)
        "OHM" -> painterResource(Res.drawable.ohm)
        "OKB" -> painterResource(Res.drawable.okb)
        "OLT" -> painterResource(Res.drawable.olt)
        "OMG" -> painterResource(Res.drawable.omg)
        "ONE" -> painterResource(Res.drawable.one)
        "ONION" -> painterResource(Res.drawable.onion)
        "ONT" -> painterResource(Res.drawable.ont)
        "OPEN" -> painterResource(Res.drawable.open)
        "OPIUM" -> painterResource(Res.drawable.opium)
        "ORBS" -> painterResource(Res.drawable.orbs)
        "ORC" -> painterResource(Res.drawable.orc)
        "ORN" -> painterResource(Res.drawable.orn)
        "OSMO" -> painterResource(Res.drawable.osmo)
        "OST" -> painterResource(Res.drawable.ost)
        "OVC" -> painterResource(Res.drawable.ovc)
        "OXT" -> painterResource(Res.drawable.oxt)
        "PAI" -> painterResource(Res.drawable.pai)
        "PAINT" -> painterResource(Res.drawable.paint)
        "PAL" -> painterResource(Res.drawable.pal)
        "PAR" -> painterResource(Res.drawable.par)
        "PART" -> painterResource(Res.drawable.part)
        "PAX" -> painterResource(Res.drawable.pax)
        "PAXG" -> painterResource(Res.drawable.paxg)
        "PAY" -> painterResource(Res.drawable.pay)
        "PBR" -> painterResource(Res.drawable.pbr)
        "PBTC" -> painterResource(Res.drawable.pbtc)
        "PENDLE" -> painterResource(Res.drawable.pendle)
        "PERL" -> painterResource(Res.drawable.perl)
        "PERP" -> painterResource(Res.drawable.perp)
        "PICKLE" -> painterResource(Res.drawable.pickle)
        "PIVX" -> painterResource(Res.drawable.pivx)
        "PLAY" -> painterResource(Res.drawable.play)
        "PLDAI" -> painterResource(Res.drawable.pldai)
        "PLR" -> painterResource(Res.drawable.plr)
        "PLUSDC" -> painterResource(Res.drawable.plusdc)
        "PNG" -> painterResource(Res.drawable.png)
        "PNK" -> painterResource(Res.drawable.pnk)
        "PNT" -> painterResource(Res.drawable.pnt)
        "POA" -> painterResource(Res.drawable.poa)
        "POE" -> painterResource(Res.drawable.poe)
        "POKT" -> painterResource(Res.drawable.pokt)
        "POLS" -> painterResource(Res.drawable.pols)
        "POLY" -> painterResource(Res.drawable.poly)
        "POND" -> painterResource(Res.drawable.pond)
        "POOL" -> painterResource(Res.drawable.pool)
        "POWR" -> painterResource(Res.drawable.powr)
        "PPAY" -> painterResource(Res.drawable.ppay)
        "PPC" -> painterResource(Res.drawable.ppc)
        "PPP" -> painterResource(Res.drawable.ppp)
        "PPT" -> painterResource(Res.drawable.ppt)
        "PRE" -> painterResource(Res.drawable.pre)
        "PREMIA" -> painterResource(Res.drawable.premia)
        "PRL" -> painterResource(Res.drawable.prl)
        "PRO" -> painterResource(Res.drawable.pro)
        "PROS" -> painterResource(Res.drawable.pros)
        "PRQ" -> painterResource(Res.drawable.prq)
        "PST" -> painterResource(Res.drawable.pst)
        "QASH" -> painterResource(Res.drawable.qash)
        "QBIT" -> painterResource(Res.drawable.qbit)
        "QI" -> painterResource(Res.drawable.qi)
        "QKC" -> painterResource(Res.drawable.qkc)
        "QLC" -> painterResource(Res.drawable.qlc)
        "QNT" -> painterResource(Res.drawable.qnt)
        "QSP" -> painterResource(Res.drawable.qsp)
        "QTUM" -> painterResource(Res.drawable.qtum)
        "QUICK" -> painterResource(Res.drawable.quick)
        "R" -> painterResource(Res.drawable.r)
        "RAE" -> painterResource(Res.drawable.rae)
        "RARI" -> painterResource(Res.drawable.rari)
        "RAY" -> painterResource(Res.drawable.ray)
        "RCN" -> painterResource(Res.drawable.rcn)
        "RDD" -> painterResource(Res.drawable.rdd)
        "RDN" -> painterResource(Res.drawable.rdn)
        "REN" -> painterResource(Res.drawable.ren)
        "REP" -> painterResource(Res.drawable.rep)
        "REQ" -> painterResource(Res.drawable.req)
        "RESOURCE_NEW" -> painterResource(Res.drawable.resource_new)
        "RESOURCE_SUPER" -> painterResource(Res.drawable.resource_super)
        "REV" -> painterResource(Res.drawable.rev)
        "RFOX" -> painterResource(Res.drawable.rfox)
        "RHOC" -> painterResource(Res.drawable.rhoc)
        "RIF" -> painterResource(Res.drawable.rif)
        "RLC" -> painterResource(Res.drawable.rlc)
        "ROOK" -> painterResource(Res.drawable.rook)
        "ROSE" -> painterResource(Res.drawable.rose)
        "RPX" -> painterResource(Res.drawable.rpx)
        "RSR" -> painterResource(Res.drawable.rsr)
        "RSV" -> painterResource(Res.drawable.rsv)
        "RUNE" -> painterResource(Res.drawable.rune)
        "RVN" -> painterResource(Res.drawable.rvn)
        "S" -> painterResource(Res.drawable.s)
        "SAI" -> painterResource(Res.drawable.sai)
        "SALT" -> painterResource(Res.drawable.salt)
        "SAN" -> painterResource(Res.drawable.san)
        "SAND" -> painterResource(Res.drawable.sand)
        "SAR" -> painterResource(Res.drawable.sar)
        "SCRL" -> painterResource(Res.drawable.scrl)
        "SCRT" -> painterResource(Res.drawable.scrt)
        "SDT" -> painterResource(Res.drawable.sdt)
        "SEELE" -> painterResource(Res.drawable.seele)
        "SEFI" -> painterResource(Res.drawable.sefi)
        "SEM" -> painterResource(Res.drawable.sem)
        "SFI" -> painterResource(Res.drawable.sfi)
        "SFP" -> painterResource(Res.drawable.sfp)
        "SHIB" -> painterResource(Res.drawable.shib)
        "SHR" -> painterResource(Res.drawable.shr)
        "SHUF" -> painterResource(Res.drawable.shuf)
        "SIA" -> painterResource(Res.drawable.sia)
        "SKL" -> painterResource(Res.drawable.skl)
        "SKY" -> painterResource(Res.drawable.sky)
        "SLT" -> painterResource(Res.drawable.slt)
        "SMART" -> painterResource(Res.drawable.smart)
        "SNC" -> painterResource(Res.drawable.snc)
        "SNGLS" -> painterResource(Res.drawable.sngls)
        "SNM" -> painterResource(Res.drawable.snm)
        "SNT" -> painterResource(Res.drawable.snt)
        "SNX" -> painterResource(Res.drawable.snx)
        "SOL" -> painterResource(Res.drawable.sol)
        "SOUL" -> painterResource(Res.drawable.soul)
        "SOV" -> painterResource(Res.drawable.sov)
        "SPN" -> painterResource(Res.drawable.spn)
        "SRM" -> painterResource(Res.drawable.srm)
        "STAKE" -> painterResource(Res.drawable.stake)
        "STEEM" -> painterResource(Res.drawable.steem)
        "STEP" -> painterResource(Res.drawable.step)
        "STETH" -> painterResource(Res.drawable.steth)
        "STMX" -> painterResource(Res.drawable.stmx)
        "STORJ" -> painterResource(Res.drawable.storj)
        "STORM" -> painterResource(Res.drawable.storm)
        "STPT" -> painterResource(Res.drawable.stpt)
        "STRAT" -> painterResource(Res.drawable.strat)
        "STX" -> painterResource(Res.drawable.stx)
        "SUB" -> painterResource(Res.drawable.sub)
        "SUQA" -> painterResource(Res.drawable.suqa)
        "SUSHI" -> painterResource(Res.drawable.sushi)
        "SUTER" -> painterResource(Res.drawable.suter)
        "SWAP" -> painterResource(Res.drawable.swap)
        "SWTH" -> painterResource(Res.drawable.swth)
        "SXDT" -> painterResource(Res.drawable.sxdt)
        "SXP" -> painterResource(Res.drawable.sxp)
        "SYS" -> painterResource(Res.drawable.sys)
        "TBTC" -> painterResource(Res.drawable.tbtc)
        "TCT" -> painterResource(Res.drawable.tct)
        "TEL" -> painterResource(Res.drawable.tel)
        "TFUEL" -> painterResource(Res.drawable.tfuel)
        "THC" -> painterResource(Res.drawable.thc)
        "THETA" -> painterResource(Res.drawable.theta)
        "THR" -> painterResource(Res.drawable.thr)
        "TIO" -> painterResource(Res.drawable.tio)
        "TITAN" -> painterResource(Res.drawable.titan)
        "TKN" -> painterResource(Res.drawable.tkn)
        "TKY" -> painterResource(Res.drawable.tky)
        "TNB" -> painterResource(Res.drawable.tnb)
        "TNC" -> painterResource(Res.drawable.tnc)
        "TNT" -> painterResource(Res.drawable.tnt)
        "TOMO" -> painterResource(Res.drawable.tomo)
        "TORN" -> painterResource(Res.drawable.torn)
        "TPAY" -> painterResource(Res.drawable.tpay)
        "TRAC" -> painterResource(Res.drawable.trac)
        "TRB" -> painterResource(Res.drawable.trb)
        "TRIBE" -> painterResource(Res.drawable.tribe)
        "TRIG" -> painterResource(Res.drawable.trig)
        "TRTL" -> painterResource(Res.drawable.trtl)
        "TRU" -> painterResource(Res.drawable.tru)
        "TRX" -> painterResource(Res.drawable.trx)
        "TRYB" -> painterResource(Res.drawable.tryb)
        "TUBE" -> painterResource(Res.drawable.tube)
        "TUSD" -> painterResource(Res.drawable.tusd)
        "TWT" -> painterResource(Res.drawable.twt)
        "UBQ" -> painterResource(Res.drawable.ubq)
        "UBT" -> painterResource(Res.drawable.ubt)
        "UFT" -> painterResource(Res.drawable.uft)
        "ULT" -> painterResource(Res.drawable.ult)
        "UMA" -> painterResource(Res.drawable.uma)
        "UNCX" -> painterResource(Res.drawable.uncx)
        "UNFI" -> painterResource(Res.drawable.unfi)
        "UNI" -> painterResource(Res.drawable.uni)
        "UNN" -> painterResource(Res.drawable.unn)
        "UOS" -> painterResource(Res.drawable.uos)
        "UPP" -> painterResource(Res.drawable.upp)
        "USDC" -> painterResource(Res.drawable.usdc)
        "USDP" -> painterResource(Res.drawable.usdp)
        "USDS" -> painterResource(Res.drawable.usds)
        "USDT" -> painterResource(Res.drawable.usdt)
        "UTK" -> painterResource(Res.drawable.utk)
        "UUU" -> painterResource(Res.drawable.uuu)
        "VALUE" -> painterResource(Res.drawable.value)
        "VERI" -> painterResource(Res.drawable.veri)
        "VEST" -> painterResource(Res.drawable.vest)
        "VET" -> painterResource(Res.drawable.vet)
        "VGX" -> painterResource(Res.drawable.vgx)
        "VIA" -> painterResource(Res.drawable.via)
        "VIB" -> painterResource(Res.drawable.vib)
        "VIBE" -> painterResource(Res.drawable.vibe)
        "VIDT" -> painterResource(Res.drawable.vidt)
        "VIKKY" -> painterResource(Res.drawable.vikky)
        "VIN" -> painterResource(Res.drawable.vin)
        "VITE" -> painterResource(Res.drawable.vite)
        "VIU" -> painterResource(Res.drawable.viu)
        "VLX" -> painterResource(Res.drawable.vlx)
        "VRS" -> painterResource(Res.drawable.vrs)
        "VSP" -> painterResource(Res.drawable.vsp)
        "VSYS" -> painterResource(Res.drawable.vsys)
        "VTC" -> painterResource(Res.drawable.vtc)
        "WABI" -> painterResource(Res.drawable.wabi)
        "WAN" -> painterResource(Res.drawable.wan)
        "WAVES" -> painterResource(Res.drawable.waves)
        "WBTC" -> painterResource(Res.drawable.wbtc)
        "WCT" -> painterResource(Res.drawable.wct)
        "WEXPOLY" -> painterResource(Res.drawable.wexpoly)
        "WHALE" -> painterResource(Res.drawable.whale)
        "WIB" -> painterResource(Res.drawable.wib)
        "WING" -> painterResource(Res.drawable.wing)
        "WINGS" -> painterResource(Res.drawable.wings)
        "WOO" -> painterResource(Res.drawable.woo)
        "WPR" -> painterResource(Res.drawable.wpr)
        "WRX" -> painterResource(Res.drawable.wrx)
        "WTC" -> painterResource(Res.drawable.wtc)
        "WXT" -> painterResource(Res.drawable.wxt)
        "XAS" -> painterResource(Res.drawable.xas)
        "XCHF" -> painterResource(Res.drawable.xchf)
        "XEM" -> painterResource(Res.drawable.xem)
        "XHV" -> painterResource(Res.drawable.xhv)
        "XIN" -> painterResource(Res.drawable.xin)
        "XLM" -> painterResource(Res.drawable.xlm)
        "XLQ" -> painterResource(Res.drawable.xlq)
        "XMARK" -> painterResource(Res.drawable.xmark)
        "XMR" -> painterResource(Res.drawable.xmr)
        "XMX" -> painterResource(Res.drawable.xmx)
        "XNK" -> painterResource(Res.drawable.xnk)
        "XNS" -> painterResource(Res.drawable.xns)
        "XOR" -> painterResource(Res.drawable.xor)
        "XRD" -> painterResource(Res.drawable.xrd)
        "XRP" -> painterResource(Res.drawable.xrp)
        "XSN" -> painterResource(Res.drawable.xsn)
        "XSR" -> painterResource(Res.drawable.xsr)
        "XTZ" -> painterResource(Res.drawable.xtz)
        "XVG" -> painterResource(Res.drawable.xvg)
        "XYO" -> painterResource(Res.drawable.xyo)
        "XZC" -> painterResource(Res.drawable.xzc)
        "YFI" -> painterResource(Res.drawable.yfi)
        "YOYO" -> painterResource(Res.drawable.yoyo)
        "ZAI" -> painterResource(Res.drawable.zai)
        "ZB" -> painterResource(Res.drawable.zb)
        "ZCO" -> painterResource(Res.drawable.zco)
        "ZEC" -> painterResource(Res.drawable.zec)
        "ZEN" -> painterResource(Res.drawable.zen)
        "ZIL" -> painterResource(Res.drawable.zil)
        "ZKS" -> painterResource(Res.drawable.zks)
        "ZRX" -> painterResource(Res.drawable.zrx)
        else -> painterResource(Res.drawable.question_sign)
    }
}
