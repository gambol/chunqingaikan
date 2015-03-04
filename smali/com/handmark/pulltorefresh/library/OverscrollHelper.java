package com.handmark.pulltorefresh.library; class OverscrollHelper { void a() { int a;
a=0;// .class public final Lcom/handmark/pulltorefresh/library/OverscrollHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "OverscrollHelper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/TargetApi;
a=0;//     value = 0x9
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation:[I = null
a=0;// 
a=0;// .field static final DEFAULT_OVERSCROLL_SCALE:F = 1.0f
a=0;// 
a=0;// .field static final LOG_TAG:Ljava/lang/String; = "OverscrollHelper"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/OverscrollHelper;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,[I);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->HORIZONTAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->VERTICAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/OverscrollHelper;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation:[I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/OverscrollHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static isAndroidOverScrollEnabled(Landroid/view/View;)Z
a=0;//     .locals 2
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_0
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
a=0;// 
a=0;// .method public static overScrollBy(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IIIIIIFZ)V
a=0;//     .locals 8
a=0;//     .param p1, "deltaX"    # I
a=0;//     .param p2, "scrollX"    # I
a=0;//     .param p3, "deltaY"    # I
a=0;//     .param p4, "scrollY"    # I
a=0;//     .param p5, "scrollRange"    # I
a=0;//     .param p6, "fuzzyThreshold"    # I
a=0;//     .param p7, "scaleFactor"    # F
a=0;//     .param p8, "isTouchEvent"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
a=0;//             "<*>;IIIIIIFZ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     .local p0, "view":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<*>;"
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/OverscrollHelper;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget v5, v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     packed-switch v5, :pswitch_data_0
a=0;// 
a=0;//     .line 115
a=0;//     move v1, p3
a=0;// 
a=0;//     .line 116
a=0;//     .local v1, "deltaValue":I
a=0;//     #v1=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     .line 117
a=0;//     .local v4, "scrollValue":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 123
a=0;//     .local v0, "currentScrollValue":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isPullToRefreshOverScrollEnabled()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isRefreshing()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 124
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getMode()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 128
a=0;//     .local v2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->permitsPullToRefresh()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     if-nez p8, :cond_6
a=0;// 
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 129
a=0;//     add-int v3, v1, v4
a=0;// 
a=0;//     .line 132
a=0;//     .local v3, "newScrollValue":I
a=0;//     #v3=(Integer);
a=0;//     const-string v5, "OverscrollHelper"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "OverScroll. DeltaX: "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ", ScrollX: "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ", DeltaY: "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 133
a=0;//     const-string v7, ", ScrollY: "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ", NewY: "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ", ScrollRange: "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 134
a=0;//     const-string v7, ", CurrentScroll: "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 132
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 137
a=0;//     rsub-int/lit8 v5, p6, 0x0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v3, v5, :cond_2
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 143
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     sget-object v5, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->OVERSCROLLING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-array v6, v6, [Z
a=0;// 
a=0;//     #v6=(Reference,[Z);
a=0;//     invoke-virtual {p0, v5, v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setState(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;[Z)V
a=0;// 
a=0;//     .line 147
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     add-int v5, v0, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     mul-float/2addr v5, p7
a=0;// 
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setHeaderScroll(I)V
a=0;// 
a=0;//     .line 173
a=0;//     .end local v2    # "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     .end local v3    # "newScrollValue":I
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 109
a=0;//     .end local v0    # "currentScrollValue":I
a=0;//     .end local v1    # "deltaValue":I
a=0;//     .end local v4    # "scrollValue":I
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Integer);v6=(Integer);v7=(Uninit);
a=0;//     move v1, p1
a=0;// 
a=0;//     .line 110
a=0;//     .restart local v1    # "deltaValue":I
a=0;//     #v1=(Integer);
a=0;//     move v4, p2
a=0;// 
a=0;//     .line 111
a=0;//     .restart local v4    # "scrollValue":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getScrollX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 112
a=0;//     .restart local v0    # "currentScrollValue":I
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 149
a=0;//     .restart local v2    # "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     .restart local v3    # "newScrollValue":I
a=0;//     :cond_2
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);v3=(Integer);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);
a=0;//     add-int v5, p5, p6
a=0;// 
a=0;//     if-le v3, v5, :cond_4
a=0;// 
a=0;//     .line 152
a=0;//     invoke-virtual {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 155
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 156
a=0;//     sget-object v5, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->OVERSCROLLING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-array v6, v6, [Z
a=0;// 
a=0;//     #v6=(Reference,[Z);
a=0;//     invoke-virtual {p0, v5, v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setState(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;[Z)V
a=0;// 
a=0;//     .line 159
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);
a=0;//     add-int v5, v0, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v5, p5
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     mul-float/2addr v5, p7
a=0;// 
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setHeaderScroll(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 161
a=0;//     :cond_4
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-le v5, p6, :cond_5
a=0;// 
a=0;//     .line 162
a=0;//     sub-int v5, v3, p5
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-gt v5, p6, :cond_1
a=0;// 
a=0;//     .line 164
a=0;//     :cond_5
a=0;//     sget-object v5, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-array v6, v6, [Z
a=0;// 
a=0;//     #v6=(Reference,[Z);
a=0;//     invoke-virtual {p0, v5, v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setState(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;[Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 166
a=0;//     .end local v3    # "newScrollValue":I
a=0;//     :cond_6
a=0;//     #v3=(Uninit);v5=(Boolean);v6=(Integer);v7=(Uninit);
a=0;//     if-eqz p8, :cond_1
a=0;// 
a=0;//     sget-object v5, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->OVERSCROLLING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getState()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     if-ne v5, v6, :cond_1
a=0;// 
a=0;//     .line 170
a=0;//     sget-object v5, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-array v6, v6, [Z
a=0;// 
a=0;//     #v6=(Reference,[Z);
a=0;//     invoke-virtual {p0, v5, v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setState(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;[Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 107
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static overScrollBy(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IIIIIZ)V
a=0;//     .locals 9
a=0;//     .param p1, "deltaX"    # I
a=0;//     .param p2, "scrollX"    # I
a=0;//     .param p3, "deltaY"    # I
a=0;//     .param p4, "scrollY"    # I
a=0;//     .param p5, "scrollRange"    # I
a=0;//     .param p6, "isTouchEvent"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
a=0;//             "<*>;IIIIIZ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     .local p0, "view":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<*>;"
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/high16 v7, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v8, p6
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     invoke-static/range {v0 .. v8}, Lcom/handmark/pulltorefresh/library/OverscrollHelper;->overScrollBy(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IIIIIIFZ)V
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static overScrollBy(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IIIIZ)V
a=0;//     .locals 7
a=0;//     .param p1, "deltaX"    # I
a=0;//     .param p2, "scrollX"    # I
a=0;//     .param p3, "deltaY"    # I
a=0;//     .param p4, "scrollY"    # I
a=0;//     .param p5, "isTouchEvent"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
a=0;//             "<*>;IIIIZ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     .local p0, "view":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<*>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v6, p5
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     invoke-static/range {v0 .. v6}, Lcom/handmark/pulltorefresh/library/OverscrollHelper;->overScrollBy(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IIIIIZ)V
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
}}
