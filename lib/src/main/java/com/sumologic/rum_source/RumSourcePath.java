package com.sumologic.rum_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.152Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.rumSource.RumSourcePath")
@software.amazon.jsii.Jsii.Proxy(RumSourcePath.Jsii$Proxy.class)
public interface RumSourcePath extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#service_name RumSource#service_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getServiceName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#application_name RumSource#application_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApplicationName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#custom_tags RumSource#custom_tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getCustomTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#deployment_environment RumSource#deployment_environment}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDeploymentEnvironment() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#ignore_urls RumSource#ignore_urls}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIgnoreUrls() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#propagate_trace_header_cors_urls RumSource#propagate_trace_header_cors_urls}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPropagateTraceHeaderCorsUrls() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#sampling_rate RumSource#sampling_rate}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSamplingRate() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#selected_country RumSource#selected_country}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSelectedCountry() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RumSourcePath}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RumSourcePath}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RumSourcePath> {
        java.lang.String serviceName;
        java.lang.String applicationName;
        java.util.Map<java.lang.String, java.lang.String> customTags;
        java.lang.String deploymentEnvironment;
        java.util.List<java.lang.String> ignoreUrls;
        java.util.List<java.lang.String> propagateTraceHeaderCorsUrls;
        java.lang.Number samplingRate;
        java.lang.String selectedCountry;

        /**
         * Sets the value of {@link RumSourcePath#getServiceName}
         * @param serviceName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#service_name RumSource#service_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceName(java.lang.String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Sets the value of {@link RumSourcePath#getApplicationName}
         * @param applicationName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#application_name RumSource#application_name}.
         * @return {@code this}
         */
        public Builder applicationName(java.lang.String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * Sets the value of {@link RumSourcePath#getCustomTags}
         * @param customTags Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#custom_tags RumSource#custom_tags}.
         * @return {@code this}
         */
        public Builder customTags(java.util.Map<java.lang.String, java.lang.String> customTags) {
            this.customTags = customTags;
            return this;
        }

        /**
         * Sets the value of {@link RumSourcePath#getDeploymentEnvironment}
         * @param deploymentEnvironment Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#deployment_environment RumSource#deployment_environment}.
         * @return {@code this}
         */
        public Builder deploymentEnvironment(java.lang.String deploymentEnvironment) {
            this.deploymentEnvironment = deploymentEnvironment;
            return this;
        }

        /**
         * Sets the value of {@link RumSourcePath#getIgnoreUrls}
         * @param ignoreUrls Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#ignore_urls RumSource#ignore_urls}.
         * @return {@code this}
         */
        public Builder ignoreUrls(java.util.List<java.lang.String> ignoreUrls) {
            this.ignoreUrls = ignoreUrls;
            return this;
        }

        /**
         * Sets the value of {@link RumSourcePath#getPropagateTraceHeaderCorsUrls}
         * @param propagateTraceHeaderCorsUrls Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#propagate_trace_header_cors_urls RumSource#propagate_trace_header_cors_urls}.
         * @return {@code this}
         */
        public Builder propagateTraceHeaderCorsUrls(java.util.List<java.lang.String> propagateTraceHeaderCorsUrls) {
            this.propagateTraceHeaderCorsUrls = propagateTraceHeaderCorsUrls;
            return this;
        }

        /**
         * Sets the value of {@link RumSourcePath#getSamplingRate}
         * @param samplingRate Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#sampling_rate RumSource#sampling_rate}.
         * @return {@code this}
         */
        public Builder samplingRate(java.lang.Number samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }

        /**
         * Sets the value of {@link RumSourcePath#getSelectedCountry}
         * @param selectedCountry Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/rum_source#selected_country RumSource#selected_country}.
         * @return {@code this}
         */
        public Builder selectedCountry(java.lang.String selectedCountry) {
            this.selectedCountry = selectedCountry;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RumSourcePath}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RumSourcePath build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RumSourcePath}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RumSourcePath {
        private final java.lang.String serviceName;
        private final java.lang.String applicationName;
        private final java.util.Map<java.lang.String, java.lang.String> customTags;
        private final java.lang.String deploymentEnvironment;
        private final java.util.List<java.lang.String> ignoreUrls;
        private final java.util.List<java.lang.String> propagateTraceHeaderCorsUrls;
        private final java.lang.Number samplingRate;
        private final java.lang.String selectedCountry;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.serviceName = software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.applicationName = software.amazon.jsii.Kernel.get(this, "applicationName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customTags = software.amazon.jsii.Kernel.get(this, "customTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.deploymentEnvironment = software.amazon.jsii.Kernel.get(this, "deploymentEnvironment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ignoreUrls = software.amazon.jsii.Kernel.get(this, "ignoreUrls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.propagateTraceHeaderCorsUrls = software.amazon.jsii.Kernel.get(this, "propagateTraceHeaderCorsUrls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.samplingRate = software.amazon.jsii.Kernel.get(this, "samplingRate", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.selectedCountry = software.amazon.jsii.Kernel.get(this, "selectedCountry", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.serviceName = java.util.Objects.requireNonNull(builder.serviceName, "serviceName is required");
            this.applicationName = builder.applicationName;
            this.customTags = builder.customTags;
            this.deploymentEnvironment = builder.deploymentEnvironment;
            this.ignoreUrls = builder.ignoreUrls;
            this.propagateTraceHeaderCorsUrls = builder.propagateTraceHeaderCorsUrls;
            this.samplingRate = builder.samplingRate;
            this.selectedCountry = builder.selectedCountry;
        }

        @Override
        public final java.lang.String getServiceName() {
            return this.serviceName;
        }

        @Override
        public final java.lang.String getApplicationName() {
            return this.applicationName;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getCustomTags() {
            return this.customTags;
        }

        @Override
        public final java.lang.String getDeploymentEnvironment() {
            return this.deploymentEnvironment;
        }

        @Override
        public final java.util.List<java.lang.String> getIgnoreUrls() {
            return this.ignoreUrls;
        }

        @Override
        public final java.util.List<java.lang.String> getPropagateTraceHeaderCorsUrls() {
            return this.propagateTraceHeaderCorsUrls;
        }

        @Override
        public final java.lang.Number getSamplingRate() {
            return this.samplingRate;
        }

        @Override
        public final java.lang.String getSelectedCountry() {
            return this.selectedCountry;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("serviceName", om.valueToTree(this.getServiceName()));
            if (this.getApplicationName() != null) {
                data.set("applicationName", om.valueToTree(this.getApplicationName()));
            }
            if (this.getCustomTags() != null) {
                data.set("customTags", om.valueToTree(this.getCustomTags()));
            }
            if (this.getDeploymentEnvironment() != null) {
                data.set("deploymentEnvironment", om.valueToTree(this.getDeploymentEnvironment()));
            }
            if (this.getIgnoreUrls() != null) {
                data.set("ignoreUrls", om.valueToTree(this.getIgnoreUrls()));
            }
            if (this.getPropagateTraceHeaderCorsUrls() != null) {
                data.set("propagateTraceHeaderCorsUrls", om.valueToTree(this.getPropagateTraceHeaderCorsUrls()));
            }
            if (this.getSamplingRate() != null) {
                data.set("samplingRate", om.valueToTree(this.getSamplingRate()));
            }
            if (this.getSelectedCountry() != null) {
                data.set("selectedCountry", om.valueToTree(this.getSelectedCountry()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.rumSource.RumSourcePath"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RumSourcePath.Jsii$Proxy that = (RumSourcePath.Jsii$Proxy) o;

            if (!serviceName.equals(that.serviceName)) return false;
            if (this.applicationName != null ? !this.applicationName.equals(that.applicationName) : that.applicationName != null) return false;
            if (this.customTags != null ? !this.customTags.equals(that.customTags) : that.customTags != null) return false;
            if (this.deploymentEnvironment != null ? !this.deploymentEnvironment.equals(that.deploymentEnvironment) : that.deploymentEnvironment != null) return false;
            if (this.ignoreUrls != null ? !this.ignoreUrls.equals(that.ignoreUrls) : that.ignoreUrls != null) return false;
            if (this.propagateTraceHeaderCorsUrls != null ? !this.propagateTraceHeaderCorsUrls.equals(that.propagateTraceHeaderCorsUrls) : that.propagateTraceHeaderCorsUrls != null) return false;
            if (this.samplingRate != null ? !this.samplingRate.equals(that.samplingRate) : that.samplingRate != null) return false;
            return this.selectedCountry != null ? this.selectedCountry.equals(that.selectedCountry) : that.selectedCountry == null;
        }

        @Override
        public final int hashCode() {
            int result = this.serviceName.hashCode();
            result = 31 * result + (this.applicationName != null ? this.applicationName.hashCode() : 0);
            result = 31 * result + (this.customTags != null ? this.customTags.hashCode() : 0);
            result = 31 * result + (this.deploymentEnvironment != null ? this.deploymentEnvironment.hashCode() : 0);
            result = 31 * result + (this.ignoreUrls != null ? this.ignoreUrls.hashCode() : 0);
            result = 31 * result + (this.propagateTraceHeaderCorsUrls != null ? this.propagateTraceHeaderCorsUrls.hashCode() : 0);
            result = 31 * result + (this.samplingRate != null ? this.samplingRate.hashCode() : 0);
            result = 31 * result + (this.selectedCountry != null ? this.selectedCountry.hashCode() : 0);
            return result;
        }
    }
}
