package com.android.volley; class Request$Priority { void a() { int a;
a=0;// .class public final enum Lcom/android/volley/Request$Priority;
a=0;// .super Ljava/lang/Enum;
a=0;// .source "Request.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/android/volley/Request;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x4019
a=0;//     name = "Priority"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Enum",
a=0;//         "<",
a=0;//         "Lcom/android/volley/Request$Priority;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final synthetic ENUM$VALUES:[Lcom/android/volley/Request$Priority;
a=0;// 
a=0;// .field public static final enum HIGH:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;// .field public static final enum IMMEDIATE:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;// .field public static final enum LOW:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;// .field public static final enum NORMAL:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 434
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/Request$Priority;);
a=0;//     const-string v1, "LOW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/android/volley/Request$Priority;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request$Priority;);
a=0;//     sput-object v0, Lcom/android/volley/Request$Priority;->LOW:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     .line 435
a=0;//     new-instance v0, Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/Request$Priority;);
a=0;//     const-string v1, "NORMAL"
a=0;// 
a=0;//     invoke-direct {v0, v1, v3}, Lcom/android/volley/Request$Priority;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request$Priority;);
a=0;//     sput-object v0, Lcom/android/volley/Request$Priority;->NORMAL:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     .line 436
a=0;//     new-instance v0, Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/Request$Priority;);
a=0;//     const-string v1, "HIGH"
a=0;// 
a=0;//     invoke-direct {v0, v1, v4}, Lcom/android/volley/Request$Priority;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request$Priority;);
a=0;//     sput-object v0, Lcom/android/volley/Request$Priority;->HIGH:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     .line 437
a=0;//     new-instance v0, Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/Request$Priority;);
a=0;//     const-string v1, "IMMEDIATE"
a=0;// 
a=0;//     invoke-direct {v0, v1, v5}, Lcom/android/volley/Request$Priority;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request$Priority;);
a=0;//     sput-object v0, Lcom/android/volley/Request$Priority;->IMMEDIATE:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     .line 433
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/volley/Request$Priority;);
a=0;//     sget-object v1, Lcom/android/volley/Request$Priority;->LOW:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     sget-object v1, Lcom/android/volley/Request$Priority;->NORMAL:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     sget-object v1, Lcom/android/volley/Request$Priority;->HIGH:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sget-object v1, Lcom/android/volley/Request$Priority;->IMMEDIATE:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     aput-object v1, v0, v5
a=0;// 
a=0;//     sput-object v0, Lcom/android/volley/Request$Priority;->ENUM$VALUES:[Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 433
a=0;//     invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/volley/Request$Priority;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static valueOf(Ljava/lang/String;)Lcom/android/volley/Request$Priority;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     const-class v0, Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static values()[Lcom/android/volley/Request$Priority;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1
a=0;//     #v3=(Null);
a=0;//     sget-object v0, Lcom/android/volley/Request$Priority;->ENUM$VALUES:[Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/android/volley/Request$Priority;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/android/volley/Request$Priority;);
a=0;//     invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     return-object v2
a=0;// .end method
}}
