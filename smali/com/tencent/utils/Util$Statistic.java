package com.tencent.utils; class Util$Statistic { void a() { int a;
a=0;// .class public Lcom/tencent/utils/Util$Statistic;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/utils/Util;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "Statistic"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public reqSize:J
a=0;// 
a=0;// .field public response:Ljava/lang/String;
a=0;// 
a=0;// .field public rspSize:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 213
a=0;//     #p0=(Reference,Lcom/tencent/utils/Util$Statistic;);
a=0;//     iput-object p1, p0, Lcom/tencent/utils/Util$Statistic;->response:Ljava/lang/String;
a=0;// 
a=0;//     .line 214
a=0;//     int-to-long v0, p2
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/utils/Util$Statistic;->reqSize:J
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/tencent/utils/Util$Statistic;->response:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/tencent/utils/Util$Statistic;->response:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Lcom/tencent/utils/Util$Statistic;->rspSize:J
a=0;// 
a=0;//     .line 217
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
