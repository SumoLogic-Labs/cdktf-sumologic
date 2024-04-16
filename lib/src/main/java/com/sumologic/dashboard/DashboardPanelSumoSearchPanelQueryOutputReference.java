package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.851Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelSumoSearchPanelQueryOutputReference")
public class DashboardPanelSumoSearchPanelQueryOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DashboardPanelSumoSearchPanelQueryOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DashboardPanelSumoSearchPanelQueryOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DashboardPanelSumoSearchPanelQueryOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putMetricsQueryData(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryData value) {
        software.amazon.jsii.Kernel.call(this, "putMetricsQueryData", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMetricsQueryData() {
        software.amazon.jsii.Kernel.call(this, "resetMetricsQueryData", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetricsQueryMode() {
        software.amazon.jsii.Kernel.call(this, "resetMetricsQueryMode", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryDataOutputReference getMetricsQueryData() {
        return software.amazon.jsii.Kernel.get(this, "metricsQueryData", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryDataOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryData getMetricsQueryDataInput() {
        return software.amazon.jsii.Kernel.get(this, "metricsQueryDataInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryData.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMetricsQueryModeInput() {
        return software.amazon.jsii.Kernel.get(this, "metricsQueryModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getQueryKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "queryKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getQueryStringInput() {
        return software.amazon.jsii.Kernel.get(this, "queryStringInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getQueryTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "queryTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMetricsQueryMode() {
        return software.amazon.jsii.Kernel.get(this, "metricsQueryMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMetricsQueryMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "metricsQueryMode", java.util.Objects.requireNonNull(value, "metricsQueryMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getQueryKey() {
        return software.amazon.jsii.Kernel.get(this, "queryKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setQueryKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "queryKey", java.util.Objects.requireNonNull(value, "queryKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getQueryString() {
        return software.amazon.jsii.Kernel.get(this, "queryString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setQueryString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "queryString", java.util.Objects.requireNonNull(value, "queryString is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getQueryType() {
        return software.amazon.jsii.Kernel.get(this, "queryType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setQueryType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "queryType", java.util.Objects.requireNonNull(value, "queryType is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelQuery value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
