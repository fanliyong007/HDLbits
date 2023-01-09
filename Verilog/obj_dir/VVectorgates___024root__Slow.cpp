// Verilated -*- C++ -*-
// DESCRIPTION: Verilator output: Design implementation internals
// See VVectorgates.h for the primary calling header

#include "verilated.h"

#include "VVectorgates__Syms.h"
#include "VVectorgates___024root.h"

void VVectorgates___024root___ctor_var_reset(VVectorgates___024root* vlSelf);

VVectorgates___024root::VVectorgates___024root(const char* _vcname__)
    : VerilatedModule(_vcname__)
 {
    // Reset structure values
    VVectorgates___024root___ctor_var_reset(this);
}

void VVectorgates___024root::__Vconfigure(VVectorgates__Syms* _vlSymsp, bool first) {
    if (false && first) {}  // Prevent unused
    this->vlSymsp = _vlSymsp;
}

VVectorgates___024root::~VVectorgates___024root() {
}
