package com.android.volley; class NetworkResponse { void a() { int a;
a=0;// .class public Lcom/android/volley/NetworkResponse;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NetworkResponse.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public final data:[B
a=0;// 
a=0;// .field public final headers:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field public final notModified:Z
a=0;// 
a=0;// .field public final statusCode:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I[BLjava/util/Map;Z)V
a=0;//     .locals 0
a=0;//     .param p1, "statusCode"    # I
a=0;//     .param p2, "data"    # [B
a=0;//     .param p4, "notModified"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I[B",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;Z)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     .local p3, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Lcom/android/volley/NetworkResponse;);
a=0;//     iput p1, p0, Lcom/android/volley/NetworkResponse;->statusCode:I
a=0;// 
a=0;//     .line 38
a=0;//     iput-object p2, p0, Lcom/android/volley/NetworkResponse;->data:[B
a=0;// 
a=0;//     .line 39
a=0;//     iput-object p3, p0, Lcom/android/volley/NetworkResponse;->headers:Ljava/util/Map;
a=0;// 
a=0;//     .line 40
a=0;//     iput-boolean p4, p0, Lcom/android/volley/NetworkResponse;->notModified:Z
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>([B)V
a=0;//     .locals 3
a=0;//     .param p1, "data"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     const/16 v0, 0xc8
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, v0, p1, v1, v2}, Lcom/android/volley/NetworkResponse;-><init>(I[BLjava/util/Map;Z)V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/android/volley/NetworkResponse;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>([BLjava/util/Map;)V
a=0;//     .locals 2
a=0;//     .param p1, "data"    # [B
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([B",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     .local p2, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     const/16 v0, 0xc8
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, p1, p2, v1}, Lcom/android/volley/NetworkResponse;-><init>(I[BLjava/util/Map;Z)V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Lcom/android/volley/NetworkResponse;);
a=0;//     return-void
a=0;// .end method
}}
