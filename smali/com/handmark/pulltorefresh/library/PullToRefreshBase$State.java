package com.handmark.pulltorefresh.library; class PullToRefreshBase$State { void a() { int a;
a=0;// .class public final enum Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
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
a=0;//     name = "State"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Enum",
a=0;//         "<",
a=0;//         "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final synthetic ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;// .field public static final enum MANUAL_REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;// .field public static final enum OVERSCROLLING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;// .field public static final enum PULL_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;// .field public static final enum REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;// .field public static final enum RELEASE_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;// .field public static final enum RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mIntValue:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1525
a=0;//     #v4=(Null);
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     const-string v1, "RESET"
a=0;// 
a=0;//     .line 1529
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v4, v4}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     .line 1531
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     const-string v1, "PULL_TO_REFRESH"
a=0;// 
a=0;//     .line 1535
a=0;//     invoke-direct {v0, v1, v5, v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->PULL_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     .line 1537
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     const-string v1, "RELEASE_TO_REFRESH"
a=0;// 
a=0;//     .line 1541
a=0;//     invoke-direct {v0, v1, v6, v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RELEASE_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     .line 1543
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     const-string v1, "REFRESHING"
a=0;// 
a=0;//     .line 1546
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {v0, v1, v7, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     .line 1548
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     const-string v1, "MANUAL_REFRESHING"
a=0;// 
a=0;//     .line 1552
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     invoke-direct {v0, v1, v8, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->MANUAL_REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     .line 1554
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     const-string v1, "OVERSCROLLING"
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     .line 1558
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->OVERSCROLLING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     .line 1523
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->PULL_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     aput-object v1, v0, v5
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RELEASE_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     aput-object v1, v0, v6
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     aput-object v1, v0, v7
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->MANUAL_REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     aput-object v1, v0, v8
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     sget-object v2, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->OVERSCROLLING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;II)V
a=0;//     .locals 0
a=0;//     .param p3, "intValue"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1579
a=0;//     invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1580
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     iput p3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->mIntValue:I
a=0;// 
a=0;//     .line 1581
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static mapIntToValue(I)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;//     .locals 5
a=0;//     .param p0, "stateInt"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1567
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
a=0;//     if-lt v1, v3, :cond_1
a=0;// 
a=0;//     .line 1574
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1567
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     aget-object v0, v2, v1
a=0;// 
a=0;//     .line 1568
a=0;//     .local v0, "value":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;"
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->getIntValue()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq p0, v4, :cond_0
a=0;// 
a=0;//     .line 1567
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static valueOf(Ljava/lang/String;)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     const-class v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1
a=0;//     #v3=(Null);
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
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
a=0;//     .line 1584
a=0;//     iget v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->mIntValue:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
