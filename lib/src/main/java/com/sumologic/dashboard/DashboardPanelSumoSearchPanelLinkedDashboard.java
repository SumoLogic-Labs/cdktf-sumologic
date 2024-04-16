package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.835Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelSumoSearchPanelLinkedDashboard")
@software.amazon.jsii.Jsii.Proxy(DashboardPanelSumoSearchPanelLinkedDashboard.Jsii$Proxy.class)
public interface DashboardPanelSumoSearchPanelLinkedDashboard extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#id Dashboard#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getId();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#include_time_range Dashboard#include_time_range}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIncludeTimeRange() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#include_variables Dashboard#include_variables}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIncludeVariables() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#relative_path Dashboard#relative_path}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRelativePath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DashboardPanelSumoSearchPanelLinkedDashboard}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardPanelSumoSearchPanelLinkedDashboard}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardPanelSumoSearchPanelLinkedDashboard> {
        java.lang.String id;
        java.lang.Object includeTimeRange;
        java.lang.Object includeVariables;
        java.lang.String relativePath;

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelLinkedDashboard#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#id Dashboard#id}. This parameter is required.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelLinkedDashboard#getIncludeTimeRange}
         * @param includeTimeRange Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#include_time_range Dashboard#include_time_range}.
         * @return {@code this}
         */
        public Builder includeTimeRange(java.lang.Boolean includeTimeRange) {
            this.includeTimeRange = includeTimeRange;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelLinkedDashboard#getIncludeTimeRange}
         * @param includeTimeRange Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#include_time_range Dashboard#include_time_range}.
         * @return {@code this}
         */
        public Builder includeTimeRange(com.hashicorp.cdktf.IResolvable includeTimeRange) {
            this.includeTimeRange = includeTimeRange;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelLinkedDashboard#getIncludeVariables}
         * @param includeVariables Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#include_variables Dashboard#include_variables}.
         * @return {@code this}
         */
        public Builder includeVariables(java.lang.Boolean includeVariables) {
            this.includeVariables = includeVariables;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelLinkedDashboard#getIncludeVariables}
         * @param includeVariables Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#include_variables Dashboard#include_variables}.
         * @return {@code this}
         */
        public Builder includeVariables(com.hashicorp.cdktf.IResolvable includeVariables) {
            this.includeVariables = includeVariables;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelLinkedDashboard#getRelativePath}
         * @param relativePath Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#relative_path Dashboard#relative_path}.
         * @return {@code this}
         */
        public Builder relativePath(java.lang.String relativePath) {
            this.relativePath = relativePath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardPanelSumoSearchPanelLinkedDashboard}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardPanelSumoSearchPanelLinkedDashboard build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardPanelSumoSearchPanelLinkedDashboard}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardPanelSumoSearchPanelLinkedDashboard {
        private final java.lang.String id;
        private final java.lang.Object includeTimeRange;
        private final java.lang.Object includeVariables;
        private final java.lang.String relativePath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.includeTimeRange = software.amazon.jsii.Kernel.get(this, "includeTimeRange", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.includeVariables = software.amazon.jsii.Kernel.get(this, "includeVariables", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.relativePath = software.amazon.jsii.Kernel.get(this, "relativePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.id = java.util.Objects.requireNonNull(builder.id, "id is required");
            this.includeTimeRange = builder.includeTimeRange;
            this.includeVariables = builder.includeVariables;
            this.relativePath = builder.relativePath;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getIncludeTimeRange() {
            return this.includeTimeRange;
        }

        @Override
        public final java.lang.Object getIncludeVariables() {
            return this.includeVariables;
        }

        @Override
        public final java.lang.String getRelativePath() {
            return this.relativePath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("id", om.valueToTree(this.getId()));
            if (this.getIncludeTimeRange() != null) {
                data.set("includeTimeRange", om.valueToTree(this.getIncludeTimeRange()));
            }
            if (this.getIncludeVariables() != null) {
                data.set("includeVariables", om.valueToTree(this.getIncludeVariables()));
            }
            if (this.getRelativePath() != null) {
                data.set("relativePath", om.valueToTree(this.getRelativePath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardPanelSumoSearchPanelLinkedDashboard"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardPanelSumoSearchPanelLinkedDashboard.Jsii$Proxy that = (DashboardPanelSumoSearchPanelLinkedDashboard.Jsii$Proxy) o;

            if (!id.equals(that.id)) return false;
            if (this.includeTimeRange != null ? !this.includeTimeRange.equals(that.includeTimeRange) : that.includeTimeRange != null) return false;
            if (this.includeVariables != null ? !this.includeVariables.equals(that.includeVariables) : that.includeVariables != null) return false;
            return this.relativePath != null ? this.relativePath.equals(that.relativePath) : that.relativePath == null;
        }

        @Override
        public final int hashCode() {
            int result = this.id.hashCode();
            result = 31 * result + (this.includeTimeRange != null ? this.includeTimeRange.hashCode() : 0);
            result = 31 * result + (this.includeVariables != null ? this.includeVariables.hashCode() : 0);
            result = 31 * result + (this.relativePath != null ? this.relativePath.hashCode() : 0);
            return result;
        }
    }
}
