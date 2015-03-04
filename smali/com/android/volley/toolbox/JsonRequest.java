package com.android.volley.toolbox; class JsonRequest { void a() { int a;
a=0;// .class public abstract Lcom/android/volley/toolbox/JsonRequest;
a=0;// .super Lcom/android/volley/Request;
a=0;// .source "JsonRequest.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Lcom/android/volley/Request",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final PROTOCOL_CHARSET:Ljava/lang/String; = "utf-8"
a=0;// 
a=0;// .field private static final PROTOCOL_CONTENT_TYPE:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mListener:Lcom/android/volley/Response$Listener;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/android/volley/Response$Listener",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mRequestBody:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     const-string v0, "application/json; charset=%s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 39
a=0;//     sput-object v0, Lcom/android/volley/toolbox/JsonRequest;->PROTOCOL_CONTENT_TYPE:Ljava/lang/String;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "method"    # I
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "requestBody"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/android/volley/Response$Listener",
a=0;//             "<TT;>;",
a=0;//             "Lcom/android/volley/Response$ErrorListener;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     .local p0, "this":Lcom/android/volley/toolbox/JsonRequest;, "Lcom/android/volley/toolbox/JsonRequest<TT;>;"
a=0;//     .local p4, "listener":Lcom/android/volley/Response$Listener;, "Lcom/android/volley/Response$Listener<TT;>;"
a=0;//     .local p5, "errorListener":Lcom/android/volley/Response$ErrorListener;, "Lcom/android/volley/Response$ErrorListener;"
a=0;//     invoke-direct {p0, p1, p2, p5}, Lcom/android/volley/Request;-><init>(ILjava/lang/String;Lcom/android/volley/Response$ErrorListener;)V
a=0;// 
a=0;//     .line 59
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/JsonRequest;);
a=0;//     iput-object p4, p0, Lcom/android/volley/toolbox/JsonRequest;->mListener:Lcom/android/volley/Response$Listener;
a=0;// 
a=0;//     .line 60
a=0;//     iput-object p3, p0, Lcom/android/volley/toolbox/JsonRequest;->mRequestBody:Ljava/lang/String;
a=0;// 
a=0;//     .line 61
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
a=0;//     .locals 6
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "requestBody"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/android/volley/Response$Listener",
a=0;//             "<TT;>;",
a=0;//             "Lcom/android/volley/Response$ErrorListener;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     .local p0, "this":Lcom/android/volley/toolbox/JsonRequest;, "Lcom/android/volley/toolbox/JsonRequest<TT;>;"
a=0;//     .local p3, "listener":Lcom/android/volley/Response$Listener;, "Lcom/android/volley/Response$Listener<TT;>;"
a=0;//     .local p4, "errorListener":Lcom/android/volley/Response$ErrorListener;, "Lcom/android/volley/Response$ErrorListener;"
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lcom/android/volley/toolbox/JsonRequest;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/Response$Listener;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Lcom/android/volley/Response$ErrorListener;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/android/volley/toolbox/JsonRequest;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
a=0;// 
a=0;//     .line 54
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/JsonRequest;);p0=(Reference,Lcom/android/volley/toolbox/JsonRequest;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected deliverResponse(Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     .local p0, "this":Lcom/android/volley/toolbox/JsonRequest;, "Lcom/android/volley/toolbox/JsonRequest<TT;>;"
a=0;//     .local p1, "response":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/JsonRequest;->mListener:Lcom/android/volley/Response$Listener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Response$Listener;);
a=0;//     invoke-interface {v0, p1}, Lcom/android/volley/Response$Listener;->onResponse(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getBody()[B
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/android/volley/toolbox/JsonRequest;, "Lcom/android/volley/toolbox/JsonRequest<TT;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/JsonRequest;->mRequestBody:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,[B);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 95
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/JsonRequest;->mRequestBody:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 96
a=0;//     :catch_0
a=0;//     #v1=(Null);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 97
a=0;//     .local v0, "uee":Ljava/io/UnsupportedEncodingException;
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     const-string v2, "Unsupported Encoding while trying to get the bytes of %s using %s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 98
a=0;//     #v4=(Null);
a=0;//     iget-object v5, p0, Lcom/android/volley/toolbox/JsonRequest;->mRequestBody:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const-string v5, "utf-8"
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     .line 97
a=0;//     invoke-static {v2, v3}, Lcom/android/volley/VolleyLog;->wtf(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getBodyContentType()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     .local p0, "this":Lcom/android/volley/toolbox/JsonRequest;, "Lcom/android/volley/toolbox/JsonRequest<TT;>;"
a=0;//     sget-object v0, Lcom/android/volley/toolbox/JsonRequest;->PROTOCOL_CONTENT_TYPE:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPostBody()[B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     .local p0, "this":Lcom/android/volley/toolbox/JsonRequest;, "Lcom/android/volley/toolbox/JsonRequest<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/android/volley/toolbox/JsonRequest;->getBody()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPostBodyContentType()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     .local p0, "this":Lcom/android/volley/toolbox/JsonRequest;, "Lcom/android/volley/toolbox/JsonRequest<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/android/volley/toolbox/JsonRequest;->getBodyContentType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract parseNetworkResponse(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/NetworkResponse;",
a=0;//             ")",
a=0;//             "Lcom/android/volley/Response",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
}}
