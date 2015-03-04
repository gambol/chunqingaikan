package com.google.gson; class FieldNamingPolicy$5 { void a() { int a;
a=0;// .class final enum Lcom/google/gson/FieldNamingPolicy$5;
a=0;// .super Lcom/google/gson/FieldNamingPolicy;
a=0;// .source "FieldNamingPolicy.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/FieldNamingPolicy;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x4008
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/lang/String;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/google/gson/FieldNamingPolicy;-><init>(Ljava/lang/String;ILcom/google/gson/FieldNamingPolicy$1;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/FieldNamingPolicy$5;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public translateName(Ljava/lang/reflect/Field;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p1, "f"    # Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "-"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/google/gson/FieldNamingPolicy;->access$200(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
