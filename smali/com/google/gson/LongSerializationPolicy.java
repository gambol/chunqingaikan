package com.google.gson; class LongSerializationPolicy { void a() { int a;
a=0;// .class public abstract enum Lcom/google/gson/LongSerializationPolicy;
a=0;// .super Ljava/lang/Enum;
a=0;// .source "LongSerializationPolicy.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Enum",
a=0;//         "<",
a=0;//         "Lcom/google/gson/LongSerializationPolicy;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final synthetic $VALUES:[Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;// .field public static final enum DEFAULT:Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;// .field public static final enum STRING:Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 34
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Lcom/google/gson/LongSerializationPolicy$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/LongSerializationPolicy$1;);
a=0;//     const-string v1, "DEFAULT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/google/gson/LongSerializationPolicy$1;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/LongSerializationPolicy$1;);
a=0;//     sput-object v0, Lcom/google/gson/LongSerializationPolicy;->DEFAULT:Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v0, Lcom/google/gson/LongSerializationPolicy$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/LongSerializationPolicy$2;);
a=0;//     const-string v1, "STRING"
a=0;// 
a=0;//     invoke-direct {v0, v1, v3}, Lcom/google/gson/LongSerializationPolicy$2;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/LongSerializationPolicy$2;);
a=0;//     sput-object v0, Lcom/google/gson/LongSerializationPolicy;->STRING:Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     .line 27
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/google/gson/LongSerializationPolicy;);
a=0;//     sget-object v1, Lcom/google/gson/LongSerializationPolicy;->DEFAULT:Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     sget-object v1, Lcom/google/gson/LongSerializationPolicy;->STRING:Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     sput-object v0, Lcom/google/gson/LongSerializationPolicy;->$VALUES:[Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/LongSerializationPolicy;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Ljava/lang/String;ILcom/google/gson/LongSerializationPolicy$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Ljava/lang/String;
a=0;//     .param p2, "x1"    # I
a=0;//     .param p3, "x2"    # Lcom/google/gson/LongSerializationPolicy$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0, p1, p2}, Lcom/google/gson/LongSerializationPolicy;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/LongSerializationPolicy;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static valueOf(Ljava/lang/String;)Lcom/google/gson/LongSerializationPolicy;
a=0;//     .locals 1
a=0;//     .param p0, "name"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     const-class v0, Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static values()[Lcom/google/gson/LongSerializationPolicy;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     sget-object v0, Lcom/google/gson/LongSerializationPolicy;->$VALUES:[Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/google/gson/LongSerializationPolicy;);
a=0;//     invoke-virtual {v0}, [Lcom/google/gson/LongSerializationPolicy;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract serialize(Ljava/lang/Long;)Lcom/google/gson/JsonElement;
a=0;// .end method
}}
