package com.handmark.pulltorefresh.library; class PullToRefreshScrollView { void a() { int a;
a=0;// .class public Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView;
a=0;// .super Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
a=0;// .source "PullToRefreshScrollView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView$InternalScrollViewSDK9;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
a=0;//         "<",
a=0;//         "Landroid/widget/ScrollView;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     .local p3, "style":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;"
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;)V
a=0;// 
a=0;//     .line 42
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected bridge synthetic createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView;->createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/ScrollView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ScrollView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/ScrollView;
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView$InternalScrollViewSDK9;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView$InternalScrollViewSDK9;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView$InternalScrollViewSDK9;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView;Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 58
a=0;//     .local v0, "scrollView":Landroid/widget/ScrollView;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     sget v1, Lcom/handmark/pulltorefresh/library/R$id;->scrollview:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setId(I)V
a=0;// 
a=0;//     .line 59
a=0;//     return-object v0
a=0;// 
a=0;//     .line 55
a=0;//     .end local v0    # "scrollView":Landroid/widget/ScrollView;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Landroid/widget/ScrollView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ScrollView;);
a=0;//     invoke-direct {v0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .restart local v0    # "scrollView":Landroid/widget/ScrollView;
a=0;//     #v0=(Reference,Landroid/widget/ScrollView;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->VERTICAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected isReadyForPullEnd()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     #v2=(Null);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ScrollView;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ScrollView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 70
a=0;//     .local v0, "scrollViewChild":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     check-cast v1, Landroid/widget/ScrollView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/ScrollView;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     if-lt v1, v3, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 73
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Integer);v3=(Integer);v4=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 71
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Landroid/widget/ScrollView;);v3=(Uninit);v4=(Uninit);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 73
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected isReadyForPullStart()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshScrollView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ScrollView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ScrollView;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
