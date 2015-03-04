package com.google.gson; class JsonNull { void a() { int a;
a=0;// .class public final Lcom/google/gson/JsonNull;
a=0;// .super Lcom/google/gson/JsonElement;
a=0;// .source "JsonNull.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final INSTANCE:Lcom/google/gson/JsonNull;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     new-instance v0, Lcom/google/gson/JsonNull;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/JsonNull;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/JsonNull;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonNull;);
a=0;//     sput-object v0, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Lcom/google/gson/JsonElement;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #p0=(Reference,Lcom/google/gson/JsonNull;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method bridge synthetic deepCopy()Lcom/google/gson/JsonElement;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonNull;->deepCopy()Lcom/google/gson/JsonNull;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonNull;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method deepCopy()Lcom/google/gson/JsonNull;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     sget-object v0, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonNull;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "other"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     if-eq p0, p1, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, Lcom/google/gson/JsonNull;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     const-class v0, Lcom/google/gson/JsonNull;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
