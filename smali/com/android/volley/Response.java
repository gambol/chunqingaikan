package com.android.volley; class Response { void a() { int a;
a=0;// .class public Lcom/android/volley/Response;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Response.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/android/volley/Response$ErrorListener;,
a=0;//         Lcom/android/volley/Response$Listener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public final cacheEntry:Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;// .field public final error:Lcom/android/volley/VolleyError;
a=0;// 
a=0;// .field public intermediate:Z
a=0;// 
a=0;// .field public final result:Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/android/volley/VolleyError;)V
a=0;//     .locals 2
a=0;//     .param p1, "error"    # Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/android/volley/Response;, "Lcom/android/volley/Response<TT;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 80
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 64
a=0;//     #p0=(Reference,Lcom/android/volley/Response;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/android/volley/Response;->intermediate:Z
a=0;// 
a=0;//     .line 81
a=0;//     iput-object v1, p0, Lcom/android/volley/Response;->result:Ljava/lang/Object;
a=0;// 
a=0;//     .line 82
a=0;//     iput-object v1, p0, Lcom/android/volley/Response;->cacheEntry:Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     .line 83
a=0;//     iput-object p1, p0, Lcom/android/volley/Response;->error:Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     .line 84
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/Object;Lcom/android/volley/Cache$Entry;)V
a=0;//     .locals 1
a=0;//     .param p2, "cacheEntry"    # Lcom/android/volley/Cache$Entry;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;",
a=0;//             "Lcom/android/volley/Cache$Entry;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     .local p0, "this":Lcom/android/volley/Response;, "Lcom/android/volley/Response<TT;>;"
a=0;//     .local p1, "result":Ljava/lang/Object;, "TT;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 64
a=0;//     #p0=(Reference,Lcom/android/volley/Response;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/android/volley/Response;->intermediate:Z
a=0;// 
a=0;//     .line 75
a=0;//     iput-object p1, p0, Lcom/android/volley/Response;->result:Ljava/lang/Object;
a=0;// 
a=0;//     .line 76
a=0;//     iput-object p2, p0, Lcom/android/volley/Response;->cacheEntry:Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     .line 77
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/volley/Response;->error:Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static error(Lcom/android/volley/VolleyError;)Lcom/android/volley/Response;
a=0;//     .locals 1
a=0;//     .param p0, "error"    # Lcom/android/volley/VolleyError;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/android/volley/VolleyError;",
a=0;//             ")",
a=0;//             "Lcom/android/volley/Response",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     new-instance v0, Lcom/android/volley/Response;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/Response;);
a=0;//     invoke-direct {v0, p0}, Lcom/android/volley/Response;-><init>(Lcom/android/volley/VolleyError;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Response;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static success(Ljava/lang/Object;Lcom/android/volley/Cache$Entry;)Lcom/android/volley/Response;
a=0;//     .locals 1
a=0;//     .param p1, "cacheEntry"    # Lcom/android/volley/Cache$Entry;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(TT;",
a=0;//             "Lcom/android/volley/Cache$Entry;",
a=0;//             ")",
a=0;//             "Lcom/android/volley/Response",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     .local p0, "result":Ljava/lang/Object;, "TT;"
a=0;//     new-instance v0, Lcom/android/volley/Response;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/Response;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/volley/Response;-><init>(Ljava/lang/Object;Lcom/android/volley/Cache$Entry;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Response;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isSuccess()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     .local p0, "this":Lcom/android/volley/Response;, "Lcom/android/volley/Response<TT;>;"
a=0;//     iget-object v0, p0, Lcom/android/volley/Response;->error:Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/VolleyError;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/android/volley/VolleyError;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
