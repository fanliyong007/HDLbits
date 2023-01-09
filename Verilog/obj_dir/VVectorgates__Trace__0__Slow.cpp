// Verilated -*- C++ -*-
// DESCRIPTION: Verilator output: Tracing implementation internals
#include "verilated_vcd_c.h"
#include "VVectorgates__Syms.h"


VL_ATTR_COLD void VVectorgates___024root__trace_init_sub_0(VVectorgates___024root* vlSelf, VerilatedVcd* tracep);

VL_ATTR_COLD void VVectorgates___024root__trace_init_top(VVectorgates___024root* vlSelf, VerilatedVcd* tracep) {
    if (false && vlSelf) {}  // Prevent unused
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root__trace_init_top\n"); );
    // Body
    VVectorgates___024root__trace_init_sub_0(vlSelf, tracep);
}

VL_ATTR_COLD void VVectorgates___024root__trace_init_sub_0(VVectorgates___024root* vlSelf, VerilatedVcd* tracep) {
    if (false && vlSelf) {}  // Prevent unused
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root__trace_init_sub_0\n"); );
    // Init
    const int c = vlSymsp->__Vm_baseCode;
    if (false && tracep && c) {}  // Prevent unused
    // Body
    tracep->declBus(c+1,"a", false,-1, 2,0);
    tracep->declBus(c+2,"b", false,-1, 2,0);
    tracep->declBus(c+3,"out_or_bitwise", false,-1, 2,0);
    tracep->declBit(c+4,"out_or_logical", false,-1);
    tracep->declBus(c+5,"out_not", false,-1, 5,0);
    tracep->declBus(c+1,"Vectorgates a", false,-1, 2,0);
    tracep->declBus(c+2,"Vectorgates b", false,-1, 2,0);
    tracep->declBus(c+3,"Vectorgates out_or_bitwise", false,-1, 2,0);
    tracep->declBit(c+4,"Vectorgates out_or_logical", false,-1);
    tracep->declBus(c+5,"Vectorgates out_not", false,-1, 5,0);
    tracep->declBus(c+6,"Vectorgates out_not_T", false,-1, 2,0);
    tracep->declBus(c+7,"Vectorgates out_not_T_1", false,-1, 2,0);
}

VL_ATTR_COLD void VVectorgates___024root__trace_full_top_0(void* voidSelf, VerilatedVcd* tracep);
void VVectorgates___024root__trace_chg_top_0(void* voidSelf, VerilatedVcd* tracep);
void VVectorgates___024root__trace_cleanup(void* voidSelf, VerilatedVcd* /*unused*/);

VL_ATTR_COLD void VVectorgates___024root__trace_register(VVectorgates___024root* vlSelf, VerilatedVcd* tracep) {
    if (false && vlSelf) {}  // Prevent unused
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root__trace_register\n"); );
    // Body
    tracep->addFullCb(&VVectorgates___024root__trace_full_top_0, vlSelf);
    tracep->addChgCb(&VVectorgates___024root__trace_chg_top_0, vlSelf);
    tracep->addCleanupCb(&VVectorgates___024root__trace_cleanup, vlSelf);
}

VL_ATTR_COLD void VVectorgates___024root__trace_full_sub_0(VVectorgates___024root* vlSelf, VerilatedVcd* tracep);

VL_ATTR_COLD void VVectorgates___024root__trace_full_top_0(void* voidSelf, VerilatedVcd* tracep) {
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root__trace_full_top_0\n"); );
    // Init
    VVectorgates___024root* const __restrict vlSelf VL_ATTR_UNUSED = static_cast<VVectorgates___024root*>(voidSelf);
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    // Body
    VVectorgates___024root__trace_full_sub_0((&vlSymsp->TOP), tracep);
}

VL_ATTR_COLD void VVectorgates___024root__trace_full_sub_0(VVectorgates___024root* vlSelf, VerilatedVcd* tracep) {
    if (false && vlSelf) {}  // Prevent unused
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root__trace_full_sub_0\n"); );
    // Init
    vluint32_t* const oldp VL_ATTR_UNUSED = tracep->oldp(vlSymsp->__Vm_baseCode);
    // Body
    tracep->fullCData(oldp+1,(vlSelf->a),3);
    tracep->fullCData(oldp+2,(vlSelf->b),3);
    tracep->fullCData(oldp+3,(vlSelf->out_or_bitwise),3);
    tracep->fullBit(oldp+4,(vlSelf->out_or_logical));
    tracep->fullCData(oldp+5,(vlSelf->out_not),6);
    tracep->fullCData(oldp+6,((7U & (~ (IData)(vlSelf->b)))),3);
    tracep->fullCData(oldp+7,((7U & (~ (IData)(vlSelf->a)))),3);
}
