package com.android.volley; class Cache$Entry { void a() { int a;
a=0;// .class public Lcom/android/volley/Cache$Entry;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Cache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/android/volley/Cache;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "Entry"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public data:[B
a=0;// 
a=0;// .field public etag:Ljava/lang/String;
a=0;// 
a=0;// .field public responseHeaders:Ljava/util/Map;
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
a=0;// .field public serverDate:J
a=0;// 
a=0;// .field public softTtl:J
a=0;// 
a=0;// .field public ttl:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 84
a=0;//     #p0=(Reference,Lcom/android/volley/Cache$Entry;);
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     iput-object v0, p0, Lcom/android/volley/Cache$Entry;->responseHeaders:Ljava/util/Map;
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isExpired()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iget-wide v0, p0, Lcom/android/volley/Cache$Entry;->ttl:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public refreshNeeded()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-wide v0, p0, Lcom/android/volley/Cache$Entry;->softTtl:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
