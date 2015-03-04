package com.handmark.pulltorefresh.library; class PullToRefreshBase$Mode { void a() { int a;
a=0;// .class public final enum Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// .super Ljava/lang/Enum;
a=0;// .source "PullToRefreshBase.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x4019
a=0;//     name = "Mode"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Enum",
a=0;//         "<",
a=0;//         "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final enum BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;// .field public static final enum DISABLED:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;// .field private static final synthetic ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;// .field public static final enum MANUAL_REFRESH_ONLY:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;// .field public static PULL_DOWN_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;// .field public static final enum PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;// .field public static final enum PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;// .field public static PULL_UP_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mIntValue:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
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
a=0;//     .line 1336
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     const-string v1, "DISABLED"
a=0;// 
a=0;//     .line 1339
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->DISABLED:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 1341
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     const-string v1, "PULL_FROM_START"
a=0;// 
a=0;//     .line 1346
a=0;//     invoke-direct {v0, v1, v3, v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 1348
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     const-string v1, "PULL_FROM_END"
a=0;// 
a=0;//     .line 1353
a=0;//     invoke-direct {v0, v1, v4, v4}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 1355
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     const-string v1, "BOTH"
a=0;// 
a=0;//     .line 1358
a=0;//     invoke-direct {v0, v1, v5, v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 1360
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     const-string v1, "MANUAL_REFRESH_ONLY"
a=0;// 
a=0;//     .line 1365
a=0;//     invoke-direct {v0, v1, v6, v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->MANUAL_REFRESH_ONLY:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->DISABLED:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     aput-object v1, v0, v5
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->MANUAL_REFRESH_ONLY:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     aput-object v1, v0, v6
a=0;// 
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 1370
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_DOWN_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 1375
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_UP_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;II)V
a=0;//     .locals 0
a=0;//     .param p3, "modeInt"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1403
a=0;//     invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1404
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     iput p3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->mIntValue:I
a=0;// 
a=0;//     .line 1405
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1397
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static mapIntToValue(I)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;//     .locals 5
a=0;//     .param p0, "modeInt"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1386
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
a=0;//     if-lt v1, v3, :cond_1
a=0;// 
a=0;//     .line 1393
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1386
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     aget-object v0, v2, v1
a=0;// 
a=0;//     .line 1387
a=0;//     .local v0, "value":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->getIntValue()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq p0, v4, :cond_0
a=0;// 
a=0;//     .line 1386
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static valueOf(Ljava/lang/String;)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     const-class v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1
a=0;//     #v3=(Null);
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method getIntValue()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1429
a=0;//     iget v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->mIntValue:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method permitsPullToRefresh()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1411
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->DISABLED:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     if-eq p0, v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->MANUAL_REFRESH_ONLY:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     if-ne p0, v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public showFooterLoadingLayout()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1425
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     if-eq p0, v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     if-eq p0, v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->MANUAL_REFRESH_ONLY:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     if-eq p0, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public showHeaderLoadingLayout()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1418
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     if-eq p0, v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     if-eq p0, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
