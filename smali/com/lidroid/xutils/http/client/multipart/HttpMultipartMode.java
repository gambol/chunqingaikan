package com.lidroid.xutils.http.client.multipart; class HttpMultipartMode { void a() { int a;
a=0;// .class public final enum Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// .super Ljava/lang/Enum;
a=0;// .source "HttpMultipartMode.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Enum",
a=0;//         "<",
a=0;//         "Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final enum BROWSER_COMPATIBLE:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;// .field private static final synthetic ENUM$VALUES:[Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;// .field public static final enum STRICT:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
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
a=0;//     .line 23
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     const-string v1, "STRICT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 26
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->STRICT:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     .line 27
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     const-string v1, "BROWSER_COMPATIBLE"
a=0;// 
a=0;//     invoke-direct {v0, v1, v3}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 30
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->BROWSER_COMPATIBLE:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     .line 21
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->STRICT:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->BROWSER_COMPATIBLE:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->ENUM$VALUES:[Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static valueOf(Ljava/lang/String;)Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     const-class v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static values()[Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1
a=0;//     #v3=(Null);
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->ENUM$VALUES:[Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     return-object v2
a=0;// .end method
}}
