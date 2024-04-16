package com.sumologic.rum_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.152Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.rumSource.RumSourcePathOutputReference")
public class RumSourcePathOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected RumSourcePathOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RumSourcePathOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public RumSourcePathOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetApplicationName() {
        software.amazon.jsii.Kernel.call(this, "resetApplicationName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomTags() {
        software.amazon.jsii.Kernel.call(this, "resetCustomTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeploymentEnvironment() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentEnvironment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIgnoreUrls() {
        software.amazon.jsii.Kernel.call(this, "resetIgnoreUrls", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPropagateTraceHeaderCorsUrls() {
        software.amazon.jsii.Kernel.call(this, "resetPropagateTraceHeaderCorsUrls", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSamplingRate() {
        software.amazon.jsii.Kernel.call(this, "resetSamplingRate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSelectedCountry() {
        software.amazon.jsii.Kernel.call(this, "resetSelectedCountry", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getApplicationNameInput() {
        return software.amazon.jsii.Kernel.get(this, "applicationNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getCustomTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "customTagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeploymentEnvironmentInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentEnvironmentInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIgnoreUrlsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "ignoreUrlsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPropagateTraceHeaderCorsUrlsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "propagateTraceHeaderCorsUrlsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getSamplingRateInput() {
        return software.amazon.jsii.Kernel.get(this, "samplingRateInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSelectedCountryInput() {
        return software.amazon.jsii.Kernel.get(this, "selectedCountryInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApplicationName() {
        return software.amazon.jsii.Kernel.get(this, "applicationName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApplicationName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "applicationName", java.util.Objects.requireNonNull(value, "applicationName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getCustomTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "customTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCustomTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "customTags", java.util.Objects.requireNonNull(value, "customTags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeploymentEnvironment() {
        return software.amazon.jsii.Kernel.get(this, "deploymentEnvironment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeploymentEnvironment(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deploymentEnvironment", java.util.Objects.requireNonNull(value, "deploymentEnvironment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIgnoreUrls() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ignoreUrls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setIgnoreUrls(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "ignoreUrls", java.util.Objects.requireNonNull(value, "ignoreUrls is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPropagateTraceHeaderCorsUrls() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "propagateTraceHeaderCorsUrls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setPropagateTraceHeaderCorsUrls(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "propagateTraceHeaderCorsUrls", java.util.Objects.requireNonNull(value, "propagateTraceHeaderCorsUrls is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSamplingRate() {
        return software.amazon.jsii.Kernel.get(this, "samplingRate", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setSamplingRate(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "samplingRate", java.util.Objects.requireNonNull(value, "samplingRate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSelectedCountry() {
        return software.amazon.jsii.Kernel.get(this, "selectedCountry", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSelectedCountry(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "selectedCountry", java.util.Objects.requireNonNull(value, "selectedCountry is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceName() {
        return software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceName", java.util.Objects.requireNonNull(value, "serviceName is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.rum_source.RumSourcePath getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.rum_source.RumSourcePath.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.rum_source.RumSourcePath value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
