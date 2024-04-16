package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.820Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardLayoutGrid")
@software.amazon.jsii.Jsii.Proxy(DashboardLayoutGrid.Jsii$Proxy.class)
public interface DashboardLayoutGrid extends software.amazon.jsii.JsiiSerializable {

    /**
     * layout_structure block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#layout_structure Dashboard#layout_structure}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getLayoutStructure();

    /**
     * @return a {@link Builder} of {@link DashboardLayoutGrid}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardLayoutGrid}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardLayoutGrid> {
        java.lang.Object layoutStructure;

        /**
         * Sets the value of {@link DashboardLayoutGrid#getLayoutStructure}
         * @param layoutStructure layout_structure block. This parameter is required.
         *                        Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#layout_structure Dashboard#layout_structure}
         * @return {@code this}
         */
        public Builder layoutStructure(com.hashicorp.cdktf.IResolvable layoutStructure) {
            this.layoutStructure = layoutStructure;
            return this;
        }

        /**
         * Sets the value of {@link DashboardLayoutGrid#getLayoutStructure}
         * @param layoutStructure layout_structure block. This parameter is required.
         *                        Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#layout_structure Dashboard#layout_structure}
         * @return {@code this}
         */
        public Builder layoutStructure(java.util.List<? extends com.sumologic.dashboard.DashboardLayoutGridLayoutStructure> layoutStructure) {
            this.layoutStructure = layoutStructure;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardLayoutGrid}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardLayoutGrid build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardLayoutGrid}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardLayoutGrid {
        private final java.lang.Object layoutStructure;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.layoutStructure = software.amazon.jsii.Kernel.get(this, "layoutStructure", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.layoutStructure = java.util.Objects.requireNonNull(builder.layoutStructure, "layoutStructure is required");
        }

        @Override
        public final java.lang.Object getLayoutStructure() {
            return this.layoutStructure;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("layoutStructure", om.valueToTree(this.getLayoutStructure()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardLayoutGrid"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardLayoutGrid.Jsii$Proxy that = (DashboardLayoutGrid.Jsii$Proxy) o;

            return this.layoutStructure.equals(that.layoutStructure);
        }

        @Override
        public final int hashCode() {
            int result = this.layoutStructure.hashCode();
            return result;
        }
    }
}
