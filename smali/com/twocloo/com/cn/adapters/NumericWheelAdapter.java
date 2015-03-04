package com.twocloo.com.cn.adapters; class NumericWheelAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NumericWheelAdapter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DEFAULT_MAX_VALUE:I = 0x9
a=0;// 
a=0;// .field private static final DEFAULT_MIN_VALUE:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private format:Ljava/lang/String;
a=0;// 
a=0;// .field private maxValue:I
a=0;// 
a=0;// .field private minValue:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;-><init>(II)V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(II)V
a=0;//     .locals 1
a=0;//     .param p1, "minValue"    # I
a=0;//     .param p2, "maxValue"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;-><init>(IILjava/lang/String;)V
a=0;// 
a=0;//     .line 52
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(IILjava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "minValue"    # I
a=0;//     .param p2, "maxValue"    # I
a=0;//     .param p3, "format"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 61
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;->minValue:I
a=0;// 
a=0;//     .line 62
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;->maxValue:I
a=0;// 
a=0;//     .line 63
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;->format:Ljava/lang/String;
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getItem(I)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     if-ltz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge p1, v1, :cond_1
a=0;// 
a=0;//     .line 69
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;->minValue:I
a=0;// 
a=0;//     add-int v0, v1, p1
a=0;// 
a=0;//     .line 70
a=0;//     .local v0, "value":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;->format:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;->format:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 72
a=0;//     .end local v0    # "value":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 70
a=0;//     .restart local v0    # "value":I
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 72
a=0;//     .end local v0    # "value":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItemsCount()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;->maxValue:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;->minValue:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getMaximumLength()I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;->maxValue:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;->minValue:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 83
a=0;//     .local v0, "max":I
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 84
a=0;//     .local v1, "maxLen":I
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;->minValue:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     return v1
a=0;// .end method
}}
