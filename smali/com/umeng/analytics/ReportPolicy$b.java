package com.umeng.analytics; class ReportPolicy$b { void a() { int a;
a=0;// .class public Lcom/umeng/analytics/ReportPolicy$b;
a=0;// .super Lcom/umeng/analytics/ReportPolicy$e;
a=0;// .source "ReportPolicy.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/umeng/analytics/ReportPolicy;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "b"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:J
a=0;// 
a=0;// .field private b:J
a=0;// 
a=0;// .field private c:Lu/aly/w;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lu/aly/w;J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/ReportPolicy$e;-><init>()V
a=0;// 
a=0;//     .line 66
a=0;//     #p0=(Reference,Lcom/umeng/analytics/ReportPolicy$b;);
a=0;//     const-wide/16 v0, 0x2710
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/umeng/analytics/ReportPolicy$b;->a:J
a=0;// 
a=0;//     .line 72
a=0;//     iput-object p1, p0, Lcom/umeng/analytics/ReportPolicy$b;->c:Lu/aly/w;
a=0;// 
a=0;//     .line 73
a=0;//     iget-wide v0, p0, Lcom/umeng/analytics/ReportPolicy$b;->a:J
a=0;// 
a=0;//     cmp-long v0, p2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     iget-wide p2, p0, Lcom/umeng/analytics/ReportPolicy$b;->a:J
a=0;// 
a=0;//     :cond_0
a=0;//     iput-wide p2, p0, Lcom/umeng/analytics/ReportPolicy$b;->b:J
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-wide v0, p0, Lcom/umeng/analytics/ReportPolicy$b;->b:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Z)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v2, p0, Lcom/umeng/analytics/ReportPolicy$b;->c:Lu/aly/w;
a=0;// 
a=0;//     #v2=(Reference,Lu/aly/w;);
a=0;//     iget-wide v2, v2, Lu/aly/w;->c:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     iget-wide v2, p0, Lcom/umeng/analytics/ReportPolicy$b;->b:J
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 81
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
