package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.819Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardLayout")
@software.amazon.jsii.Jsii.Proxy(DashboardLayout.Jsii$Proxy.class)
public interface DashboardLayout extends software.amazon.jsii.JsiiSerializable {

    /**
     * grid block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#grid Dashboard#grid}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardLayoutGrid getGrid() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DashboardLayout}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardLayout}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardLayout> {
        com.sumologic.dashboard.DashboardLayoutGrid grid;

        /**
         * Sets the value of {@link DashboardLayout#getGrid}
         * @param grid grid block.
         *             Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#grid Dashboard#grid}
         * @return {@code this}
         */
        public Builder grid(com.sumologic.dashboard.DashboardLayoutGrid grid) {
            this.grid = grid;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardLayout}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardLayout build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardLayout}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardLayout {
        private final com.sumologic.dashboard.DashboardLayoutGrid grid;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.grid = software.amazon.jsii.Kernel.get(this, "grid", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardLayoutGrid.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.grid = builder.grid;
        }

        @Override
        public final com.sumologic.dashboard.DashboardLayoutGrid getGrid() {
            return this.grid;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getGrid() != null) {
                data.set("grid", om.valueToTree(this.getGrid()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardLayout"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardLayout.Jsii$Proxy that = (DashboardLayout.Jsii$Proxy) o;

            return this.grid != null ? this.grid.equals(that.grid) : that.grid == null;
        }

        @Override
        public final int hashCode() {
            int result = this.grid != null ? this.grid.hashCode() : 0;
            return result;
        }
    }
}
