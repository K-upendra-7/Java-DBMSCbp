package com.lb.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // ---------------- Common Pages ---------------- //

    @GetMapping("/")
    public String homePage() {
        return "common/home";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "common/about";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "common/login";
    }

    @GetMapping("/register/mediator")
    public String registerMediatorPage() {
        return "common/register_mediator";
    }
     @GetMapping("/contact")
    public String contactPage() {
        return "common/contact";
    }
   

    @GetMapping("/register/constructor")
    public String registerConstructorPage() {
        return "common/register_constructor";
    }

    /* @GetMapping("/error")
    public String errorPage() {
        return "common/error";
    } */

    // ---------------- Admin Pages ---------------- //

    @GetMapping("/admin/dashboard")
    public String adminDashboard(Model model) {
        // Add dashboard data
        // model.addAttribute("mediatorCount", mediatorService.count());
        return "admin/admin_dashboard";
    }

    @GetMapping("/admin/verify-mediators")
    public String adminVerifyMediators(Model model) {
        // model.addAttribute("pendingMediators", mediatorService.findUnverified());
        return "admin/admin_verify_mediators";
    }

    @GetMapping("/admin/view-reports")
    public String adminViewReports() {
        return "admin/admin_view_reports";
    }

    @GetMapping("/admin/manage-disputes")
    public String adminManageDisputes() {
        return "admin/admin_manage_disputes";
    }

    // ---------------- Mediator Pages ---------------- //

    @GetMapping("/mediator/dashboard")
    public String mediatorDashboard(Model model) {
        // model.addAttribute("labourCount", labourService.countByMediator());
        // model.addAttribute("pendingRequests", requestService.findPending());
        return "mediator/mediator_dashboard";
    }

    @GetMapping("/mediator/register-labourer")
    public String registerLabourerPage() {
        return "mediator/mediator_register_labourer";
    }

    @GetMapping("/mediator/labourers")
    public String mediatorLabourerList(Model model) {
        // model.addAttribute("labourers", labourService.findByMediator());
        return "mediator/mediator_labourer_list";
    }

    @GetMapping("/mediator/requests")
    public String mediatorViewRequests(Model model) {
        // model.addAttribute("requests", workRequestService.findByRegion());
        return "mediator/mediator_view_requests";
    }

    @GetMapping("/mediator/assign-labourers")
    public String mediatorAssignLabourers() {
        return "mediator/mediator_assign_labourers";
    }

    @GetMapping("/mediator/payments")
    public String mediatorPayments() {
        return "mediator/mediator_payments";
    }

    @GetMapping("/mediator/profile")
    public String mediatorProfile() {
        return "mediator/mediator_profile";
    }

    // ---------------- Constructor Pages ---------------- //

    @GetMapping("/constructor/dashboard")
    public String constructorDashboard() {
        return "constructor/constructor_dashboard";
    }

    @GetMapping("/constructor/post-work")
    public String postWorkPage() {
        return "constructor/constructor_post_work";
    }

    @GetMapping("/constructor/my-requests")
    public String myRequestsPage() {
        return "constructor/constructor_my_requests";
    }

    @GetMapping("/constructor/payment")
    public String paymentPage() {
        return "constructor/constructor_payment";
    }

    @GetMapping("/constructor/profile")
    public String constructorProfile() {
        return "constructor/constructor_profile";
    }

    // ---------------- Labourer Pages ---------------- //

    @GetMapping("/labourer/details")
    public String labourerDetails() {
        return "labourer/labourer_details";
    }

    @GetMapping("/labourer/payment-status")
    public String labourerPaymentStatus() {
        return "labourer/labourer_payment_status";
    }
}
