// Verilated -*- C++ -*-
// DESCRIPTION: Verilator output: Model implementation (design independent parts)

#include "VVectorgates.h"
#include "VVectorgates__Syms.h"
#include "verilated_vcd_c.h"

//============================================================
// Constructors

VVectorgates::VVectorgates(VerilatedContext* _vcontextp__, const char* _vcname__)
    : vlSymsp{new VVectorgates__Syms(_vcontextp__, _vcname__, this)}
    , a{vlSymsp->TOP.a}
    , b{vlSymsp->TOP.b}
    , out_or_bitwise{vlSymsp->TOP.out_or_bitwise}
    , out_or_logical{vlSymsp->TOP.out_or_logical}
    , out_not{vlSymsp->TOP.out_not}
    , rootp{&(vlSymsp->TOP)}
{
}

VVectorgates::VVectorgates(const char* _vcname__)
    : VVectorgates(nullptr, _vcname__)
{
}

//============================================================
// Destructor

VVectorgates::~VVectorgates() {
    delete vlSymsp;
}

//============================================================
// Evaluation loop

void VVectorgates___024root___eval_initial(VVectorgates___024root* vlSelf);
void VVectorgates___024root___eval_settle(VVectorgates___024root* vlSelf);
void VVectorgates___024root___eval(VVectorgates___024root* vlSelf);
#ifdef VL_DEBUG
void VVectorgates___024root___eval_debug_assertions(VVectorgates___024root* vlSelf);
#endif  // VL_DEBUG
void VVectorgates___024root___final(VVectorgates___024root* vlSelf);

static void _eval_initial_loop(VVectorgates__Syms* __restrict vlSymsp) {
    vlSymsp->__Vm_didInit = true;
    VVectorgates___024root___eval_initial(&(vlSymsp->TOP));
    // Evaluate till stable
    vlSymsp->__Vm_activity = true;
    do {
        VL_DEBUG_IF(VL_DBG_MSGF("+ Initial loop\n"););
        VVectorgates___024root___eval_settle(&(vlSymsp->TOP));
        VVectorgates___024root___eval(&(vlSymsp->TOP));
    } while (0);
}

void VVectorgates::eval_step() {
    VL_DEBUG_IF(VL_DBG_MSGF("+++++TOP Evaluate VVectorgates::eval_step\n"); );
#ifdef VL_DEBUG
    // Debug assertions
    VVectorgates___024root___eval_debug_assertions(&(vlSymsp->TOP));
#endif  // VL_DEBUG
    // Initialize
    if (VL_UNLIKELY(!vlSymsp->__Vm_didInit)) _eval_initial_loop(vlSymsp);
    // Evaluate till stable
    vlSymsp->__Vm_activity = true;
    do {
        VL_DEBUG_IF(VL_DBG_MSGF("+ Clock loop\n"););
        VVectorgates___024root___eval(&(vlSymsp->TOP));
    } while (0);
    // Evaluate cleanup
}

//============================================================
// Utilities

VerilatedContext* VVectorgates::contextp() const {
    return vlSymsp->_vm_contextp__;
}

const char* VVectorgates::name() const {
    return vlSymsp->name();
}

//============================================================
// Invoke final blocks

VL_ATTR_COLD void VVectorgates::final() {
    VVectorgates___024root___final(&(vlSymsp->TOP));
}

//============================================================
// Trace configuration

void VVectorgates___024root__trace_init_top(VVectorgates___024root* vlSelf, VerilatedVcd* tracep);

VL_ATTR_COLD static void trace_init(void* voidSelf, VerilatedVcd* tracep, uint32_t code) {
    // Callback from tracep->open()
    VVectorgates___024root* const __restrict vlSelf VL_ATTR_UNUSED = static_cast<VVectorgates___024root*>(voidSelf);
    VVectorgates__Syms* const __restrict vlSymsp VL_ATTR_UNUSED = vlSelf->vlSymsp;
    if (!vlSymsp->_vm_contextp__->calcUnusedSigs()) {
        VL_FATAL_MT(__FILE__, __LINE__, __FILE__,
            "Turning on wave traces requires Verilated::traceEverOn(true) call before time 0.");
    }
    vlSymsp->__Vm_baseCode = code;
    tracep->module(vlSymsp->name());
    tracep->scopeEscape(' ');
    VVectorgates___024root__trace_init_top(vlSelf, tracep);
    tracep->scopeEscape('.');
}

VL_ATTR_COLD void VVectorgates___024root__trace_register(VVectorgates___024root* vlSelf, VerilatedVcd* tracep);

VL_ATTR_COLD void VVectorgates::trace(VerilatedVcdC* tfp, int levels, int options) {
    if (false && levels && options) {}  // Prevent unused
    tfp->spTrace()->addInitCb(&trace_init, &(vlSymsp->TOP));
    VVectorgates___024root__trace_register(&(vlSymsp->TOP), tfp->spTrace());
}
