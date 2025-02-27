package br.com.cerniauskas.criptotracker.core.presentation

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
import org.jetbrains.compose.resources.DrawableResource

fun getDrawableIdForCoin(symbol: String): DrawableResource {
    return when (symbol.uppercase()) {
        "1INCH" -> Res.drawable._inch
        "ST" -> Res.drawable._st
        "XBTC" -> Res.drawable._xbtc
        "AAVE" -> Res.drawable.aave
        "ABBC" -> Res.drawable.abbc
        "ABT" -> Res.drawable.abt
        "AC3" -> Res.drawable.ac3
        "ACT" -> Res.drawable.act
        "ADA" -> Res.drawable.ada
        "ADB" -> Res.drawable.adb
        "ADX" -> Res.drawable.adx
        "AE" -> Res.drawable.ae
        "AEON" -> Res.drawable.aeon
        "AERGO" -> Res.drawable.aergo
        "AGI" -> Res.drawable.agi
        "AION" -> Res.drawable.aion
        "AIT" -> Res.drawable.ait
        "AKRO" -> Res.drawable.akro
        "AKT" -> Res.drawable.akt
        "ALCX" -> Res.drawable.alcx
        "ALEPH" -> Res.drawable.aleph
        "ALGO" -> Res.drawable.algo
        "ALIS" -> Res.drawable.alis
        "ALPHA" -> Res.drawable.alpha
        "ALX" -> Res.drawable.alx
        "AMB" -> Res.drawable.amb
        "AMLT" -> Res.drawable.amlt
        "AMP" -> Res.drawable.amp
        "AMPL" -> Res.drawable.ampl
        "ANC" -> Res.drawable.anc
        "ANJ" -> Res.drawable.anj
        "ANKR" -> Res.drawable.ankr
        "ANT" -> Res.drawable.ant
        "APH" -> Res.drawable.aph
        "APL" -> Res.drawable.apl
        "APPC" -> Res.drawable.appc
        "APW" -> Res.drawable.apw
        "APY" -> Res.drawable.apy
        "AR" -> Res.drawable.ar
        "ARDR" -> Res.drawable.ardr
        "ARK" -> Res.drawable.ark
        "ARMOR" -> Res.drawable.armor
        "ARN" -> Res.drawable.arn
        "ARO" -> Res.drawable.aro
        "ARRR" -> Res.drawable.arrr
        "AST" -> Res.drawable.ast
        "ATMI" -> Res.drawable.atmi
        "ATOM" -> Res.drawable.atom
        "AUC" -> Res.drawable.auc
        "AURA" -> Res.drawable.aura
        "AUTO" -> Res.drawable.auto
        "AVAX" -> Res.drawable.avax
        "AWC" -> Res.drawable.awc
        "AXP" -> Res.drawable.axp
        "BAC" -> Res.drawable.bac
        "BAL" -> Res.drawable.bal
        "BAND" -> Res.drawable.band
        "BAO" -> Res.drawable.bao
        "BAT" -> Res.drawable.bat
        "BAY" -> Res.drawable.bay
        "BBR" -> Res.drawable.bbr
        "BCD" -> Res.drawable.bcd
        "BCH" -> Res.drawable.bch
        "BCHA" -> Res.drawable.bcha
        "BCN" -> Res.drawable.bcn
        "BCO" -> Res.drawable.bco
        "BEL" -> Res.drawable.bel
        "BETA" -> Res.drawable.beta
        "BF" -> Res.drawable.bf
        "BIFI" -> Res.drawable.bifi
        "BIX" -> Res.drawable.bix
        "BLK" -> Res.drawable.blk
        "BLOCK" -> Res.drawable.block
        "BLT" -> Res.drawable.blt
        "BLUE" -> Res.drawable.blue
        "BLZ" -> Res.drawable.blz
        "BNB" -> Res.drawable.bnb
        "BNT" -> Res.drawable.bnt
        "BOND" -> Res.drawable.bond
        "BONDLY" -> Res.drawable.bondly
        "BORA" -> Res.drawable.bora
        "BOX" -> Res.drawable.box
        "BPT" -> Res.drawable.bpt
        "BRD" -> Res.drawable.brd
        "BTC" -> Res.drawable.btc
        "BTC_" -> Res.drawable.btc__
        "BTCP" -> Res.drawable.btcp
        "BTG" -> Res.drawable.btg
        "BTMX" -> Res.drawable.btmx
        "BTO" -> Res.drawable.bto
        "BTS" -> Res.drawable.bts
        "BTT" -> Res.drawable.btt
        "BTU" -> Res.drawable.btu
        "BU" -> Res.drawable.bu
        "BUNNY" -> Res.drawable.bunny
        "BUSD" -> Res.drawable.busd
        "BWT" -> Res.drawable.bwt
        "BZ" -> Res.drawable.bz
        "BZNT" -> Res.drawable.bznt
        "BZRX" -> Res.drawable.bzrx
        "C20" -> Res.drawable.c20
        "C98" -> Res.drawable.c98
        "CAKE" -> Res.drawable.cake
        "CAPP" -> Res.drawable.capp
        "CAR" -> Res.drawable.car
        "CARD" -> Res.drawable.card
        "CBAT" -> Res.drawable.cbat
        "CBT" -> Res.drawable.cbt
        "CDAI" -> Res.drawable.cdai
        "CDT" -> Res.drawable.cdt
        "CEL" -> Res.drawable.cel
        "CELO" -> Res.drawable.celo
        "CELR" -> Res.drawable.celr
        "CENNZ" -> Res.drawable.cennz
        "CETH" -> Res.drawable.ceth
        "CFX" -> Res.drawable.cfx
        "CHAI" -> Res.drawable.chai
        "CHAT" -> Res.drawable.chat
        "CHSB" -> Res.drawable.chsb
        "CHZ" -> Res.drawable.chz
        "CKB" -> Res.drawable.ckb
        "CLO" -> Res.drawable.clo
        "CLOAK" -> Res.drawable.cloak
        "CLOUT" -> Res.drawable.clout
        "CMT" -> Res.drawable.cmt
        "CND" -> Res.drawable.cnd
        "CNX" -> Res.drawable.cnx
        "COMP" -> Res.drawable.comp
        "CONI" -> Res.drawable.coni
        "COSM" -> Res.drawable.cosm
        "COTI" -> Res.drawable.coti
        "COV" -> Res.drawable.cov
        "COVA" -> Res.drawable.cova
        "COVER" -> Res.drawable.cover
        "CPC" -> Res.drawable.cpc
        "CRE" -> Res.drawable.cre
        "CREAM" -> Res.drawable.cream
        "CRED" -> Res.drawable.cred
        "CREP" -> Res.drawable.crep
        "CRO" -> Res.drawable.cro
        "CRPT" -> Res.drawable.crpt
        "CRV" -> Res.drawable.crv
        "CS" -> Res.drawable.cs
        "CSAI" -> Res.drawable.csai
        "CSC" -> Res.drawable.csc
        "CTC" -> Res.drawable.ctc
        "CTXC" -> Res.drawable.ctxc
        "CUSDC" -> Res.drawable.cusdc
        "CV" -> Res.drawable.cv
        "CVC" -> Res.drawable.cvc
        "CVP" -> Res.drawable.cvp
        "CVT" -> Res.drawable.cvt
        "CVX" -> Res.drawable.cvx
        "CWBTC" -> Res.drawable.cwbtc
        "CZR" -> Res.drawable.czrx
        "DADI" -> Res.drawable.dadi
        "DAFI" -> Res.drawable.dafi
        "DAG" -> Res.drawable.dag
        "DAI" -> Res.drawable.dai
        "DASH" -> Res.drawable.dash
        "DAT" -> Res.drawable.dat
        "DATA" -> Res.drawable.data
        "DATX" -> Res.drawable.datx
        "DBC" -> Res.drawable.dbc
        "DCN" -> Res.drawable.dcn
        "DCR" -> Res.drawable.dcr
        "DCT" -> Res.drawable.dct
        "DDD" -> Res.drawable.ddd
        "DENT" -> Res.drawable.dent
        "DERI" -> Res.drawable.deri
        "DFI" -> Res.drawable.dfi
        "DFT" -> Res.drawable.dft
        "DFYN" -> Res.drawable.dfyn
        "DGB" -> Res.drawable.dgb
        "DGD" -> Res.drawable.dgd
        "DGTX" -> Res.drawable.dgtx
        "DIVI" -> Res.drawable.divi
        "DLT" -> Res.drawable.dlt
        "DMT" -> Res.drawable.dmt
        "DNT" -> Res.drawable.dnt
        "DOCK" -> Res.drawable.dock
        "DODO" -> Res.drawable.dodo
        "DOGE" -> Res.drawable.doge
        "DOR" -> Res.drawable.dor
        "DOT" -> Res.drawable.dot
        "DRGN" -> Res.drawable.drgn
        "DROP" -> Res.drawable.drop
        "DTA" -> Res.drawable.dta
        "DTR" -> Res.drawable.dtr
        "DTX" -> Res.drawable.dtx
        "DVF" -> Res.drawable.dvf
        "DXD" -> Res.drawable.dxd
        "DXT" -> Res.drawable.dxt
        "EDG" -> Res.drawable.edg
        "EDO" -> Res.drawable.edo
        "EFI" -> Res.drawable.efi
        "EFX" -> Res.drawable.efx
        "EGLD" -> Res.drawable.egld
        "EGT" -> Res.drawable.egt
        "EKG" -> Res.drawable.ekg
        "EKT" -> Res.drawable.ekt
        "ELA" -> Res.drawable.ela
        "ELEC" -> Res.drawable.elec
        "ELF" -> Res.drawable.elf
        "EMC" -> Res.drawable.emc
        "EMC2" -> Res.drawable.emc2
        "ENG" -> Res.drawable.eng
        "ENJ" -> Res.drawable.enj
        "EOS" -> Res.drawable.eos
        "EOSDAC" -> Res.drawable.eosdac
        "ERN" -> Res.drawable.ern
        "ESD" -> Res.drawable.esd
        "ESP" -> Res.drawable.esp
        "ESS" -> Res.drawable.ess
        "ETC" -> Res.drawable.etc
        "ETH" -> Res.drawable.eth
        "ETN" -> Res.drawable.etn
        "ETP" -> Res.drawable.etp
        "ETZ" -> Res.drawable.etz
        "EVX" -> Res.drawable.evx
        "EWT" -> Res.drawable.ewt
        "EXRN" -> Res.drawable.exrn
        "EXY" -> Res.drawable.exy
        "FAB" -> Res.drawable.fab
        "FCT" -> Res.drawable.fct
        "FEED" -> Res.drawable.feed
        "FEI" -> Res.drawable.fei
        "FET" -> Res.drawable.fet
        "FIDA" -> Res.drawable.fida
        "FIL" -> Res.drawable.fil
        "FILDA" -> Res.drawable.filda
        "FLOW" -> Res.drawable.flow
        "FOTA" -> Res.drawable.fota
        "FOX" -> Res.drawable.fox
        "FRAX" -> Res.drawable.frax
        "FRM" -> Res.drawable.frm
        "FRONT" -> Res.drawable.front
        "FSN" -> Res.drawable.fsn
        "FT" -> Res.drawable.ft
        "FTC" -> Res.drawable.ftc
        "FTM" -> Res.drawable.ftm
        "FTT" -> Res.drawable.ftt
        "FUEL" -> Res.drawable.fuel
        "FUN" -> Res.drawable.`fun`
        "FXC" -> Res.drawable.fxc
        "FXT" -> Res.drawable.fxt
        "GALA" -> Res.drawable.gala
        "GDC" -> Res.drawable.gdc
        "GEM" -> Res.drawable.gem
        "GEN" -> Res.drawable.gen
        "GNO" -> Res.drawable.gno
        "GNT" -> Res.drawable.gnt
        "GNX" -> Res.drawable.gnx
        "GO" -> Res.drawable.go
        "GOC" -> Res.drawable.goc
        "GOT" -> Res.drawable.got
        "GRIN" -> Res.drawable.grin
        "GRS" -> Res.drawable.grs
        "GRT" -> Res.drawable.grt
        "GSC" -> Res.drawable.gsc
        "GSWAP" -> Res.drawable.gswap
        "GT" -> Res.drawable.gt
        "GTC" -> Res.drawable.gtc
        "GTO" -> Res.drawable.gto
        "GUSD" -> Res.drawable.gusd
        "GVT" -> Res.drawable.gvt
        "GXS" -> Res.drawable.gxs
        "HAKKA" -> Res.drawable.hakka
        "HBAR" -> Res.drawable.hbar
        "HC" -> Res.drawable.hc
        "HEDG" -> Res.drawable.hedg
        "HER" -> Res.drawable.her
        "HEX" -> Res.drawable.hex
        "HIGH" -> Res.drawable.high
        "HIVE" -> Res.drawable.hive
        "HNT" -> Res.drawable.hnt
        "HOT" -> Res.drawable.hot
        "HOT_X" -> Res.drawable.hot_x
        "HPB" -> Res.drawable.hpb
        "HSR" -> Res.drawable.hsr
        "HT" -> Res.drawable.ht
        "HUM" -> Res.drawable.hum
        "HUSD" -> Res.drawable.husd
        "HVN" -> Res.drawable.hvn
        "HYDRO" -> Res.drawable.hydro
        "HYN" -> Res.drawable.hyn
        "HZN" -> Res.drawable.hzn
        "IBAT" -> Res.drawable.ibat
        "ICN" -> Res.drawable.icn
        "ICP" -> Res.drawable.icp
        "ICX" -> Res.drawable.icx
        "IDAI" -> Res.drawable.idai
        "IDEX" -> Res.drawable.idex
        "IETH" -> Res.drawable.ieth
        "IGNIS" -> Res.drawable.ignis
        "IKNC" -> Res.drawable.iknc
        "ILINK" -> Res.drawable.ilink
        "INB" -> Res.drawable.inb
        "INS" -> Res.drawable.ins
        "IOST" -> Res.drawable.iost
        "IOTA" -> Res.drawable.iota
        "IOTX" -> Res.drawable.iotx
        "IQ" -> Res.drawable.iq
        "IREP" -> Res.drawable.irep
        "IRIS" -> Res.drawable.iris
        "ISUSD" -> Res.drawable.isusd
        "IUSDC" -> Res.drawable.iusdc
        "IWBTC" -> Res.drawable.iwbtc
        "IZRX" -> Res.drawable.izrx
        "JNT" -> Res.drawable.jnt
        "JST" -> Res.drawable.jst
        "JUNO" -> Res.drawable.juno
        "KAVA" -> Res.drawable.kava
        "KCS" -> Res.drawable.kcs
        "KDA" -> Res.drawable.kda
        "KEEP" -> Res.drawable.keep
        "KEY" -> Res.drawable.key
        "KICK" -> Res.drawable.kick
        "KIN" -> Res.drawable.kin
        "KLAY" -> Res.drawable.klay
        "KLV" -> Res.drawable.klv
        "KMD" -> Res.drawable.kmd
        "KNC" -> Res.drawable.knc
        "KSM" -> Res.drawable.ksm
        "LAMB" -> Res.drawable.lamb
        "LAND" -> Res.drawable.land
        "LBA" -> Res.drawable.lba
        "LCX" -> Res.drawable.lcx
        "LDO" -> Res.drawable.ldo
        "LEND" -> Res.drawable.lend
        "LEO" -> Res.drawable.leo
        "LINK" -> Res.drawable.link
        "LIT" -> Res.drawable.lit
        "LKY" -> Res.drawable.lky
        "LN" -> Res.drawable.ln
        "LOKI" -> Res.drawable.loki
        "LON" -> Res.drawable.lon
        "LOOKS" -> Res.drawable.looks
        "LOOM" -> Res.drawable.loom
        "LPT" -> Res.drawable.lpt
        "LQD" -> Res.drawable.lqd
        "LQTY" -> Res.drawable.lqty
        "LRC" -> Res.drawable.lrc
        "LSK" -> Res.drawable.lsk
        "LTC" -> Res.drawable.ltc
        "LTO" -> Res.drawable.lto
        "LUN" -> Res.drawable.lun
        "LUNA" -> Res.drawable.luna
        "LXT" -> Res.drawable.lxt
        "LYM" -> Res.drawable.lym
        "MAHA" -> Res.drawable.maha
        "MAID" -> Res.drawable.maid
        "MAN" -> Res.drawable.man
        "MANA" -> Res.drawable.mana
        "MATH" -> Res.drawable.math
        "MATIC" -> Res.drawable.matic
        "MATTER" -> Res.drawable.matter
        "MBC" -> Res.drawable.mbc
        "MCO" -> Res.drawable.mco
        "MCX" -> Res.drawable.mcx
        "MDA" -> Res.drawable.mda
        "MDS" -> Res.drawable.mds
        "MED" -> Res.drawable.med
        "MEDX" -> Res.drawable.medx
        "MET" -> Res.drawable.met
        "MFG" -> Res.drawable.mfg
        "MFT" -> Res.drawable.mft
        "MIM" -> Res.drawable.mim
        "MIR" -> Res.drawable.mir
        "MITH" -> Res.drawable.mith
        "MKR" -> Res.drawable.mkr
        "MLN" -> Res.drawable.mln
        "MNGO" -> Res.drawable.mngo
        "MOD" -> Res.drawable.mod
        "MOT" -> Res.drawable.mot
        "MPL" -> Res.drawable.mpl
        "MTA" -> Res.drawable.mta
        "MTH" -> Res.drawable.mth
        "MTL" -> Res.drawable.mtl
        "MTN" -> Res.drawable.mtn
        "MVC" -> Res.drawable.mvc
        "MVL" -> Res.drawable.mvl
        "MVP" -> Res.drawable.mvp
        "MWAT" -> Res.drawable.mwat
        "MWC" -> Res.drawable.mwc
        "MXM" -> Res.drawable.mxm
        "MYB" -> Res.drawable.myb
        "NANO" -> Res.drawable.nano
        "NAS" -> Res.drawable.nas
        "NAV" -> Res.drawable.nav
        "NCASH" -> Res.drawable.ncash
        "NCT" -> Res.drawable.nct
        "NEAR" -> Res.drawable.near
        "NEBL" -> Res.drawable.nebl
        "NEC" -> Res.drawable.nec
        "NEO" -> Res.drawable.neo
        "NEX" -> Res.drawable.nex
        "NEXXO" -> Res.drawable.nexxo
        "NFT" -> Res.drawable.nft
        "NGC" -> Res.drawable.ngc
        "NIOX" -> Res.drawable.niox
        "NKN" -> Res.drawable.nkn
        "NLG" -> Res.drawable.nlg
        "NMR" -> Res.drawable.nmr
        "NOIA" -> Res.drawable.noia
        "NPER" -> Res.drawable.nper
        "NPXS" -> Res.drawable.npxs
        "NRG" -> Res.drawable.nrg
        "NRVE" -> Res.drawable.nrve
        "NU" -> Res.drawable.nu
        "NULS" -> Res.drawable.nuls
        "NXS" -> Res.drawable.nxs
        "OAG" -> Res.drawable.oag
        "OAX" -> Res.drawable.oax
        "OCEAN" -> Res.drawable.ocean
        "OCN" -> Res.drawable.ocn
        "ODE" -> Res.drawable.ode
        "OGN" -> Res.drawable.ogn
        "OHM" -> Res.drawable.ohm
        "OKB" -> Res.drawable.okb
        "OLT" -> Res.drawable.olt
        "OMG" -> Res.drawable.omg
        "ONE" -> Res.drawable.one
        "ONION" -> Res.drawable.onion
        "ONT" -> Res.drawable.ont
        "OPEN" -> Res.drawable.open
        "OPIUM" -> Res.drawable.opium
        "ORBS" -> Res.drawable.orbs
        "ORC" -> Res.drawable.orc
        "ORN" -> Res.drawable.orn
        "OSMO" -> Res.drawable.osmo
        "OST" -> Res.drawable.ost
        "OVC" -> Res.drawable.ovc
        "OXT" -> Res.drawable.oxt
        "PAI" -> Res.drawable.pai
        "PAINT" -> Res.drawable.paint
        "PAL" -> Res.drawable.pal
        "PAR" -> Res.drawable.par
        "PART" -> Res.drawable.part
        "PAX" -> Res.drawable.pax
        "PAXG" -> Res.drawable.paxg
        "PAY" -> Res.drawable.pay
        "PBR" -> Res.drawable.pbr
        "PBTC" -> Res.drawable.pbtc
        "PENDLE" -> Res.drawable.pendle
        "PERL" -> Res.drawable.perl
        "PERP" -> Res.drawable.perp
        "PICKLE" -> Res.drawable.pickle
        "PIVX" -> Res.drawable.pivx
        "PLAY" -> Res.drawable.play
        "PLDAI" -> Res.drawable.pldai
        "PLR" -> Res.drawable.plr
        "PLUSDC" -> Res.drawable.plusdc
        "PNG" -> Res.drawable.png
        "PNK" -> Res.drawable.pnk
        "PNT" -> Res.drawable.pnt
        "POA" -> Res.drawable.poa
        "POE" -> Res.drawable.poe
        "POKT" -> Res.drawable.pokt
        "POLS" -> Res.drawable.pols
        "POLY" -> Res.drawable.poly
        "POND" -> Res.drawable.pond
        "POOL" -> Res.drawable.pool
        "POWR" -> Res.drawable.powr
        "PPAY" -> Res.drawable.ppay
        "PPC" -> Res.drawable.ppc
        "PPP" -> Res.drawable.ppp
        "PPT" -> Res.drawable.ppt
        "PRE" -> Res.drawable.pre
        "PREMIA" -> Res.drawable.premia
        "PRL" -> Res.drawable.prl
        "PRO" -> Res.drawable.pro
        "PROS" -> Res.drawable.pros
        "PRQ" -> Res.drawable.prq
        "PST" -> Res.drawable.pst
        "QASH" -> Res.drawable.qash
        "QBIT" -> Res.drawable.qbit
        "QI" -> Res.drawable.qi
        "QKC" -> Res.drawable.qkc
        "QLC" -> Res.drawable.qlc
        "QNT" -> Res.drawable.qnt
        "QSP" -> Res.drawable.qsp
        "QTUM" -> Res.drawable.qtum
        "QUICK" -> Res.drawable.quick
        "R" -> Res.drawable.r
        "RAE" -> Res.drawable.rae
        "RARI" -> Res.drawable.rari
        "RAY" -> Res.drawable.ray
        "RCN" -> Res.drawable.rcn
        "RDD" -> Res.drawable.rdd
        "RDN" -> Res.drawable.rdn
        "REN" -> Res.drawable.ren
        "REP" -> Res.drawable.rep
        "REQ" -> Res.drawable.req
        "RESOURCE_NEW" -> Res.drawable.resource_new
        "RESOURCE_SUPER" -> Res.drawable.resource_super
        "REV" -> Res.drawable.rev
        "RFOX" -> Res.drawable.rfox
        "RHOC" -> Res.drawable.rhoc
        "RIF" -> Res.drawable.rif
        "RLC" -> Res.drawable.rlc
        "ROOK" -> Res.drawable.rook
        "ROSE" -> Res.drawable.rose
        "RPX" -> Res.drawable.rpx
        "RSR" -> Res.drawable.rsr
        "RSV" -> Res.drawable.rsv
        "RUNE" -> Res.drawable.rune
        "RVN" -> Res.drawable.rvn
        "S" -> Res.drawable.s
        "SAI" -> Res.drawable.sai
        "SALT" -> Res.drawable.salt
        "SAN" -> Res.drawable.san
        "SAND" -> Res.drawable.sand
        "SAR" -> Res.drawable.sar
        "SCRL" -> Res.drawable.scrl
        "SCRT" -> Res.drawable.scrt
        "SDT" -> Res.drawable.sdt
        "SEELE" -> Res.drawable.seele
        "SEFI" -> Res.drawable.sefi
        "SEM" -> Res.drawable.sem
        "SFI" -> Res.drawable.sfi
        "SFP" -> Res.drawable.sfp
        "SHIB" -> Res.drawable.shib
        "SHR" -> Res.drawable.shr
        "SHUF" -> Res.drawable.shuf
        "SIA" -> Res.drawable.sia
        "SKL" -> Res.drawable.skl
        "SKY" -> Res.drawable.sky
        "SLT" -> Res.drawable.slt
        "SMART" -> Res.drawable.smart
        "SNC" -> Res.drawable.snc
        "SNGLS" -> Res.drawable.sngls
        "SNM" -> Res.drawable.snm
        "SNT" -> Res.drawable.snt
        "SNX" -> Res.drawable.snx
        "SOL" -> Res.drawable.sol
        "SOUL" -> Res.drawable.soul
        "SOV" -> Res.drawable.sov
        "SPN" -> Res.drawable.spn
        "SRM" -> Res.drawable.srm
        "STAKE" -> Res.drawable.stake
        "STEEM" -> Res.drawable.steem
        "STEP" -> Res.drawable.step
        "STETH" -> Res.drawable.steth
        "STMX" -> Res.drawable.stmx
        "STORJ" -> Res.drawable.storj
        "STORM" -> Res.drawable.storm
        "STPT" -> Res.drawable.stpt
        "STRAT" -> Res.drawable.strat
        "STX" -> Res.drawable.stx
        "SUB" -> Res.drawable.sub
        "SUQA" -> Res.drawable.suqa
        "SUSHI" -> Res.drawable.sushi
        "SUTER" -> Res.drawable.suter
        "SWAP" -> Res.drawable.swap
        "SWTH" -> Res.drawable.swth
        "SXDT" -> Res.drawable.sxdt
        "SXP" -> Res.drawable.sxp
        "SYS" -> Res.drawable.sys
        "TBTC" -> Res.drawable.tbtc
        "TCT" -> Res.drawable.tct
        "TEL" -> Res.drawable.tel
        "TFUEL" -> Res.drawable.tfuel
        "THC" -> Res.drawable.thc
        "THETA" -> Res.drawable.theta
        "THR" -> Res.drawable.thr
        "TIO" -> Res.drawable.tio
        "TITAN" -> Res.drawable.titan
        "TKN" -> Res.drawable.tkn
        "TKY" -> Res.drawable.tky
        "TNB" -> Res.drawable.tnb
        "TNC" -> Res.drawable.tnc
        "TNT" -> Res.drawable.tnt
        "TOMO" -> Res.drawable.tomo
        "TORN" -> Res.drawable.torn
        "TPAY" -> Res.drawable.tpay
        "TRAC" -> Res.drawable.trac
        "TRB" -> Res.drawable.trb
        "TRIBE" -> Res.drawable.tribe
        "TRIG" -> Res.drawable.trig
        "TRTL" -> Res.drawable.trtl
        "TRU" -> Res.drawable.tru
        "TRX" -> Res.drawable.trx
        "TRYB" -> Res.drawable.tryb
        "TUBE" -> Res.drawable.tube
        "TUSD" -> Res.drawable.tusd
        "TWT" -> Res.drawable.twt
        "UBQ" -> Res.drawable.ubq
        "UBT" -> Res.drawable.ubt
        "UFT" -> Res.drawable.uft
        "ULT" -> Res.drawable.ult
        "UMA" -> Res.drawable.uma
        "UNCX" -> Res.drawable.uncx
        "UNFI" -> Res.drawable.unfi
        "UNI" -> Res.drawable.uni
        "UNN" -> Res.drawable.unn
        "UOS" -> Res.drawable.uos
        "UPP" -> Res.drawable.upp
        "USDC" -> Res.drawable.usdc
        "USDP" -> Res.drawable.usdp
        "USDS" -> Res.drawable.usds
        "USDT" -> Res.drawable.usdt
        "UTK" -> Res.drawable.utk
        "UUU" -> Res.drawable.uuu
        "VALUE" -> Res.drawable.value
        "VERI" -> Res.drawable.veri
        "VEST" -> Res.drawable.vest
        "VET" -> Res.drawable.vet
        "VGX" -> Res.drawable.vgx
        "VIA" -> Res.drawable.via
        "VIB" -> Res.drawable.vib
        "VIBE" -> Res.drawable.vibe
        "VIDT" -> Res.drawable.vidt
        "VIKKY" -> Res.drawable.vikky
        "VIN" -> Res.drawable.vin
        "VITE" -> Res.drawable.vite
        "VIU" -> Res.drawable.viu
        "VLX" -> Res.drawable.vlx
        "VRS" -> Res.drawable.vrs
        "VSP" -> Res.drawable.vsp
        "VSYS" -> Res.drawable.vsys
        "VTC" -> Res.drawable.vtc
        "WABI" -> Res.drawable.wabi
        "WAN" -> Res.drawable.wan
        "WAVES" -> Res.drawable.waves
        "WBTC" -> Res.drawable.wbtc
        "WCT" -> Res.drawable.wct
        "WEXPOLY" -> Res.drawable.wexpoly
        "WHALE" -> Res.drawable.whale
        "WIB" -> Res.drawable.wib
        "WING" -> Res.drawable.wing
        "WINGS" -> Res.drawable.wings
        "WOO" -> Res.drawable.woo
        "WPR" -> Res.drawable.wpr
        "WRX" -> Res.drawable.wrx
        "WTC" -> Res.drawable.wtc
        "WXT" -> Res.drawable.wxt
        "XAS" -> Res.drawable.xas
        "XCHF" -> Res.drawable.xchf
        "XEM" -> Res.drawable.xem
        "XHV" -> Res.drawable.xhv
        "XIN" -> Res.drawable.xin
        "XLM" -> Res.drawable.xlm
        "XLQ" -> Res.drawable.xlq
        "XMARK" -> Res.drawable.xmark
        "XMR" -> Res.drawable.xmr
        "XMX" -> Res.drawable.xmx
        "XNK" -> Res.drawable.xnk
        "XNS" -> Res.drawable.xns
        "XOR" -> Res.drawable.xor
        "XRD" -> Res.drawable.xrd
        "XRP" -> Res.drawable.xrp
        "XSN" -> Res.drawable.xsn
        "XSR" -> Res.drawable.xsr
        "XTZ" -> Res.drawable.xtz
        "XVG" -> Res.drawable.xvg
        "XYO" -> Res.drawable.xyo
        "XZC" -> Res.drawable.xzc
        "YFI" -> Res.drawable.yfi
        "YOYO" -> Res.drawable.yoyo
        "ZAI" -> Res.drawable.zai
        "ZB" -> Res.drawable.zb
        "ZCO" -> Res.drawable.zco
        "ZEC" -> Res.drawable.zec
        "ZEN" -> Res.drawable.zen
        "ZIL" -> Res.drawable.zil
        "ZKS" -> Res.drawable.zks
        "ZRX" -> Res.drawable.zrx
        else -> Res.drawable.question_sign
    }
}
