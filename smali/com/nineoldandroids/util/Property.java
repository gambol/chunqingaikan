package com.nineoldandroids.util; class Property { void a() { int a;
a=0;// .class public abstract Lcom/nineoldandroids/util/Property;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Property.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "V:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mName:Ljava/lang/String;
a=0;// 
a=0;// .field private final mType:Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/Class",
a=0;//             "<TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p2, "name"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TV;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     .local p0, "this":Lcom/nineoldandroids/util/Property;, "Lcom/nineoldandroids/util/Property<TT;TV;>;"
a=0;//     .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TV;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     iput-object p2, p0, Lcom/nineoldandroids/util/Property;->mName:Ljava/lang/String;
a=0;// 
a=0;//     .line 63
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/util/Property;->mType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static of(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lcom/nineoldandroids/util/Property;
a=0;//     .locals 1
a=0;//     .param p2, "name"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "V:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TV;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/nineoldandroids/util/Property",
a=0;//             "<TT;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     .local p0, "hostType":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     .local p1, "valueType":Ljava/lang/Class;, "Ljava/lang/Class<TV;>;"
a=0;//     new-instance v0, Lcom/nineoldandroids/util/ReflectiveProperty;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/util/ReflectiveProperty;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/nineoldandroids/util/ReflectiveProperty;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/util/ReflectiveProperty;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public getName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     .local p0, "this":Lcom/nineoldandroids/util/Property;, "Lcom/nineoldandroids/util/Property<TT;TV;>;"
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/util/Property;->mName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getType()Ljava/lang/Class;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     .local p0, "this":Lcom/nineoldandroids/util/Property;, "Lcom/nineoldandroids/util/Property<TT;TV;>;"
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/util/Property;->mType:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isReadOnly()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     .local p0, "this":Lcom/nineoldandroids/util/Property;, "Lcom/nineoldandroids/util/Property<TT;TV;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public set(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;TV;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     .local p0, "this":Lcom/nineoldandroids/util/Property;, "Lcom/nineoldandroids/util/Property<TT;TV;>;"
a=0;//     .local p1, "object":Ljava/lang/Object;, "TT;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TV;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Property "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/util/Property;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is read-only"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
}}
