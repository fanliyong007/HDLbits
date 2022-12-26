// Verilated -*- C++ -*-
// DESCRIPTION: Verilator output: Tracing implementation internals
#include "verilated_vcd_c.h"
#include "VVectorgates__Syms.h"


void VVectorgates___024root__trace_chg_sub_0(VVectorgates___024root* vlSelf, VerilatedVcd* tracep);

void VVectorgates___024root__trace_chg_top_0(void* voidSelf, VerilatedVcd* tracep) {
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root__trace_chg_top_0\n"); );
    // Init
    VVectorgates___024root* const __restrict vlSelf VL_ATTR_UNUSED = static_cast<VVectorgates___024root*>(voidSelf);
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    if (VL_UNLIKELY(!vlSymsp->__Vm_activity)) return;
    // Body
    VVectorgates___024root__trace_chg_sub_0((&vlSymsp->TOP), tracep);
}

void VVectorgates___024root__trace_chg_sub_0(VVectorgates___024root* vlSelf, VerilatedVcd* tracep) {
    if (false && vlSelf) {}  // Prevent unused
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root__trace_chg_sub_0\n"); );
    // Init
    vluint32_t* const oldp VL_ATTR_UNUSED = tracep->oldp(vlSymsp->__Vm_baseCode + 1);
    // Body
    tracep->chgCData(oldp+0,(vlSelf->a),3);
    tracep->chgCData(oldp+1,(vlSelf->b),3);
    tracep->chgCData(oldp+2,(vlSelf->out_or_bitwise),3);
    tracep->chgBit(oldp+3,(vlSelf->out_or_logical));
    tracep->chgCData(oldp+4,(vlSelf->out_not),6);
    tracep->chgCData(oldp+5,((7U & (~ (IData)(vlSelf->b)))),3);
    tracep->chgCData(oldp+6,((7U & (~ (IData)(vlSelf->a)))),3);
}

void VVectorgates___024root__trace_cleanup(void* voidSelf, VerilatedVcd* /*unused*/) {
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root__trace_cleanup\n"); );
    // Init
    VVectorgates___024root* const __restrict vlSelf VL_ATTR_UNUSED = static_cast<VVectorgates___024root*>(voidSelf);
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    VlUnpacked<CData/*0:0*/, 1> __Vm_traceActivity;
    // Body
    vlSymsp->__Vm_activity = false;
    __Vm_traceActivity[0U] = 0U;
}
