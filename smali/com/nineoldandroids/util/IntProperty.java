package com.nineoldandroids.util; class IntProperty { void a() { int a;
a=0;// .class public abstract Lcom/nineoldandroids/util/IntProperty;
a=0;// .super Lcom/nineoldandroids/util/Property;
a=0;// .source "IntProperty.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Lcom/nineoldandroids/util/Property",
a=0;//         "<TT;",
a=0;//         "Ljava/lang/Integer;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     .local p0, "this":Lcom/nineoldandroids/util/IntProperty;, "Lcom/nineoldandroids/util/IntProperty<TT;>;"
a=0;//     const-class v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/nineoldandroids/util/IntProperty;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final set(Ljava/lang/Object;Ljava/lang/Integer;)V
a=0;//     .locals 1
a=0;//     .param p2, "value"    # Ljava/lang/Integer;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     .local p0, "this":Lcom/nineoldandroids/util/IntProperty;, "Lcom/nineoldandroids/util/IntProperty<TT;>;"
a=0;//     .local p1, "object":Ljava/lang/Object;, "TT;"
a=0;//     invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/nineoldandroids/util/IntProperty;->set(Ljava/lang/Object;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/Object;
a=0;// 
a=0;//     check-cast p2, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/nineoldandroids/util/IntProperty;->set(Ljava/lang/Object;Ljava/lang/Integer;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract setValue(Ljava/lang/Object;I)V
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;I)V"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
}}
