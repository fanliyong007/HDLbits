// Verilated -*- C++ -*-
// DESCRIPTION: Verilator output: Design implementation internals
// See VVectorgates.h for the primary calling header

#include "verilated.h"

#include "VVectorgates___024root.h"

VL_ATTR_COLD void VVectorgates___024root___eval_initial(VVectorgates___024root* vlSelf) {
    if (false && vlSelf) {}  // Prevent unused
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root___eval_initial\n"); );
}

void VVectorgates___024root___combo__TOP__1(VVectorgates___024root* vlSelf);

VL_ATTR_COLD void VVectorgates___024root___eval_settle(VVectorgates___024root* vlSelf) {
    if (false && vlSelf) {}  // Prevent unused
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root___eval_settle\n"); );
    // Body
    VVectorgates___024root___combo__TOP__1(vlSelf);
}

VL_ATTR_COLD void VVectorgates___024root___final(VVectorgates___024root* vlSelf) {
    if (false && vlSelf) {}  // Prevent unused
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root___final\n"); );
}

VL_ATTR_COLD void VVectorgates___024root___ctor_var_reset(VVectorgates___024root* vlSelf) {
    if (false && vlSelf) {}  // Prevent unused
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    VL_DEBUG_IF(VL_DBG_MSGF("+    VVectorgates___024root___ctor_var_reset\n"); );
    // Body
    vlSelf->a = VL_RAND_RESET_I(3);
    vlSelf->b = VL_RAND_RESET_I(3);
    vlSelf->out_or_bitwise = VL_RAND_RESET_I(3);
    vlSelf->out_or_logical = VL_RAND_RESET_I(1);
    vlSelf->out_not = VL_RAND_RESET_I(6);
}
