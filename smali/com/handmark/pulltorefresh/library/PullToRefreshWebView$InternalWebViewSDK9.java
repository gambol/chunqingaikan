package com.handmark.pulltorefresh.library; class PullToRefreshWebView$InternalWebViewSDK9 { void a() { int a;
a=0;// .class final Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;
a=0;// .super Landroid/webkit/WebView;
a=0;// .source "PullToRefreshWebView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/TargetApi;
a=0;//     value = 0x9
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x10
a=0;//     name = "InternalWebViewSDK9"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final OVERSCROLL_FUZZY_THRESHOLD:I = 0x2
a=0;// 
a=0;// .field static final OVERSCROLL_SCALE_FACTOR:F = 1.5f
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;//     .param p3, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;
a=0;// 
a=0;//     .line 143
a=0;//     invoke-direct {p0, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 144
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getScrollRange()I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;);
a=0;//     iget-object v0, v0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     check-cast v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getContentHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;);
a=0;//     iget-object v0, v0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     check-cast v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getScale()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     invoke-static {v0}, Landroid/util/FloatMath;->floor(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 162
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;->getPaddingTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float/2addr v0, v2
a=0;// 
a=0;//     .line 161
a=0;//     invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected overScrollBy(IIIIIIIIZ)Z
a=0;//     .locals 10
a=0;//     .param p1, "deltaX"    # I
a=0;//     .param p2, "deltaY"    # I
a=0;//     .param p3, "scrollX"    # I
a=0;//     .param p4, "scrollY"    # I
a=0;//     .param p5, "scrollRangeX"    # I
a=0;//     .param p6, "scrollRangeY"    # I
a=0;//     .param p7, "maxOverScrollX"    # I
a=0;//     .param p8, "maxOverScrollY"    # I
a=0;//     .param p9, "isTouchEvent"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     invoke-super/range {p0 .. p9}, Landroid/webkit/WebView;->overScrollBy(IIIIIIIIZ)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 154
a=0;//     .local v9, "returnValue":Z
a=0;//     #v9=(Boolean);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;
a=0;// 
a=0;//     .line 155
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;);
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$InternalWebViewSDK9;->getScrollRange()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/high16 v7, 0x3fc00000    # 1.5f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move/from16 v8, p9
a=0;// 
a=0;//     .line 154
a=0;//     #v8=(Boolean);
a=0;//     invoke-static/range {v0 .. v8}, Lcom/handmark/pulltorefresh/library/OverscrollHelper;->overScrollBy(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IIIIIIFZ)V
a=0;// 
a=0;//     .line 157
a=0;//     return v9
a=0;// .end method
}}
