package com.actionbarsherlock.internal; class ActionBarSherlockCompat { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;
a=0;// .super Lcom/actionbarsherlock/ActionBarSherlock;
a=0;// .source "ActionBarSherlockCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// .implements Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$Callback;
a=0;// .implements Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;
a=0;// .implements Lcom/actionbarsherlock/view/Window$Callback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation runtime Lcom/actionbarsherlock/ActionBarSherlock$Implementation;
a=0;//     api = 0x7
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static final DEFAULT_FEATURES:I = 0x0
a=0;// 
a=0;// .field private static final PANELS_TAG:Ljava/lang/String; = "sherlock:Panels"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;// .field private mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;// .field private mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;// .field private mCircularProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;// .field private mClosingActionMenu:Z
a=0;// 
a=0;// .field private mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;// .field private mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;// .field private mFeatures:I
a=0;// 
a=0;// .field private mHorizontalProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;// .field private mIsDestroyed:Z
a=0;// 
a=0;// .field private mIsFloating:Z
a=0;// 
a=0;// .field private mIsTitleReady:Z
a=0;// 
a=0;// .field private mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;// .field private mMenuFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;// .field private mMenuIsPrepared:Z
a=0;// 
a=0;// .field private mMenuRefreshContent:Z
a=0;// 
a=0;// .field protected mNativeItemMap:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Landroid/view/MenuItem;",
a=0;//             "Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mReserveOverflow:Z
a=0;// 
a=0;// .field private mReserveOverflowSet:Z
a=0;// 
a=0;// .field private mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mUiOptions:I
a=0;// 
a=0;// .field private wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;I)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 58
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/ActionBarSherlock;-><init>(Landroid/app/Activity;I)V
a=0;// 
a=0;//     .line 69
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mReserveOverflowSet:Z
a=0;// 
a=0;//     .line 82
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mIsTitleReady:Z
a=0;// 
a=0;//     .line 84
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mIsDestroyed:Z
a=0;// 
a=0;//     .line 97
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mFeatures:I
a=0;// 
a=0;//     .line 99
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mUiOptions:I
a=0;// 
a=0;//     .line 114
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;)Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;)Landroid/app/Activity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;)Lcom/actionbarsherlock/view/ActionMode;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionMode;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;Lcom/actionbarsherlock/view/ActionMode;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mIsDestroyed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;)Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static cleanActivityName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "manifestPackage"    # Ljava/lang/String;
a=0;//     .param p1, "activityName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x2e
a=0;// 
a=0;//     .line 1157
a=0;//     #v1=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 1159
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 1166
a=0;//     .end local p1    # "activityName":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 1161
a=0;//     .restart local p1    # "activityName":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Char);v1=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1163
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private generateLayout()Landroid/view/ViewGroup;
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v11, 0xa
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/16 v10, 0x9
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 998
a=0;//     #v7=(Null);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v5}, Landroid/app/Activity;->getTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget-object v6, Lcom/actionbarsherlock/R$styleable;->SherlockTheme:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1000
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v7, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     iput-boolean v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mIsFloating:Z
a=0;// 
a=0;//     .line 1002
a=0;//     const/16 v5, 0x3c
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 1003
a=0;//     new-instance v5, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v6, "You must use Theme.Sherlock, Theme.Sherlock.Light, Theme.Sherlock.Light.DarkActionBar, or a derivative."
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 1006
a=0;//     :cond_0
a=0;//     #v5=(Boolean);
a=0;//     const/16 v5, 0x3b
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 1007
a=0;//     invoke-virtual {p0, v8}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->requestFeature(I)Z
a=0;// 
a=0;//     .line 1013
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v5=(PosByte);
a=0;//     const/16 v5, 0x3d
a=0;// 
a=0;//     invoke-virtual {v0, v5, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 1014
a=0;//     invoke-virtual {p0, v10}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->requestFeature(I)Z
a=0;// 
a=0;//     .line 1017
a=0;//     :cond_2
a=0;//     const/16 v5, 0x3e
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 1018
a=0;//     invoke-virtual {p0, v11}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->requestFeature(I)Z
a=0;// 
a=0;//     .line 1021
a=0;//     :cond_3
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 1024
a=0;//     invoke-virtual {p0, v8}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->hasFeature(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_7
a=0;// 
a=0;//     .line 1025
a=0;//     iget-boolean v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mIsFloating:Z
a=0;// 
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 1027
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v5}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Landroid/view/ViewGroup;
a=0;// 
a=0;//     iput-object v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 1028
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/ViewGroup;->removeAllViews()V
a=0;// 
a=0;//     .line 1030
a=0;//     sget v3, Lcom/actionbarsherlock/R$layout;->abs__dialog_title_holo:I
a=0;// 
a=0;//     .line 1045
a=0;//     .local v3, "layoutResource":I
a=0;//     :goto_1
a=0;//     #v3=(Integer);v5=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v5}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1046
a=0;//     .local v2, "in":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     new-instance v6, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v6, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v5, v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 1048
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     sget v6, Lcom/actionbarsherlock/R$id;->abs__content:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 1049
a=0;//     .local v1, "contentParent":Landroid/view/ViewGroup;
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     .line 1050
a=0;//     new-instance v5, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v6, "Couldn\'t find content container view"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 1008
a=0;//     .end local v1    # "contentParent":Landroid/view/ViewGroup;
a=0;//     .end local v2    # "in":Landroid/view/View;
a=0;//     .end local v3    # "layoutResource":I
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Boolean);
a=0;//     const/16 v5, 0x3c
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 1010
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->requestFeature(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1032
a=0;//     :cond_5
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p0, v10}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->hasFeature(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     .line 1033
a=0;//     sget v3, Lcom/actionbarsherlock/R$layout;->abs__screen_action_bar_overlay:I
a=0;// 
a=0;//     .line 1034
a=0;//     .restart local v3    # "layoutResource":I
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1035
a=0;//     .end local v3    # "layoutResource":I
a=0;//     :cond_6
a=0;//     #v3=(Uninit);
a=0;//     sget v3, Lcom/actionbarsherlock/R$layout;->abs__screen_action_bar:I
a=0;// 
a=0;//     .line 1038
a=0;//     .restart local v3    # "layoutResource":I
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v3    # "layoutResource":I
a=0;//     :cond_7
a=0;//     #v3=(Uninit);
a=0;//     invoke-virtual {p0, v11}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->hasFeature(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_8
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->hasFeature(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_8
a=0;// 
a=0;//     .line 1039
a=0;//     sget v3, Lcom/actionbarsherlock/R$layout;->abs__screen_simple_overlay_action_mode:I
a=0;// 
a=0;//     .line 1040
a=0;//     .restart local v3    # "layoutResource":I
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1041
a=0;//     .end local v3    # "layoutResource":I
a=0;//     :cond_8
a=0;//     #v3=(Uninit);
a=0;//     sget v3, Lcom/actionbarsherlock/R$layout;->abs__screen_simple:I
a=0;// 
a=0;//     .restart local v3    # "layoutResource":I
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1054
a=0;//     .restart local v1    # "contentParent":Landroid/view/ViewGroup;
a=0;//     .restart local v2    # "in":Landroid/view/View;
a=0;//     :cond_9
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);v2=(Reference,Landroid/view/View;);v5=(Reference,Landroid/view/ViewGroup;);v6=(Integer);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->setId(I)V
a=0;// 
a=0;//     .line 1055
a=0;//     const v5, 0x1020002
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->setId(I)V
a=0;// 
a=0;//     .line 1057
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->hasFeature(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_a
a=0;// 
a=0;//     .line 1058
a=0;//     invoke-direct {p0, v7}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->getCircularProgressBar(Z)Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1059
a=0;//     .local v4, "progress":Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar;);
a=0;//     if-eqz v4, :cond_a
a=0;// 
a=0;//     .line 1060
a=0;//     invoke-virtual {v4, v8}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setIndeterminate(Z)V
a=0;// 
a=0;//     .line 1064
a=0;//     .end local v4    # "progress":Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;//     :cond_a
a=0;//     #v4=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private getCircularProgressBar(Z)Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;//     .locals 2
a=0;//     .param p1, "shouldInstallDecor"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 760
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mCircularProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 761
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mCircularProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     .line 770
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 763
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 764
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->installDecor()V
a=0;// 
a=0;//     .line 766
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     sget v1, Lcom/actionbarsherlock/R$id;->abs__progress_circular:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mCircularProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     .line 767
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mCircularProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 768
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mCircularProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 770
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mCircularProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getFeatures()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 795
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mFeatures:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private getHorizontalProgressBar(Z)Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;//     .locals 2
a=0;//     .param p1, "shouldInstallDecor"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 774
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mHorizontalProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 775
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mHorizontalProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     .line 784
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 777
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 778
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->installDecor()V
a=0;// 
a=0;//     .line 780
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     sget v1, Lcom/actionbarsherlock/R$id;->abs__progress_horizontal:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mHorizontalProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     .line 781
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mHorizontalProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 782
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mHorizontalProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 784
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mHorizontalProgressBar:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private hideProgressBars(Lcom/actionbarsherlock/internal/widget/IcsProgressBar;Lcom/actionbarsherlock/internal/widget/IcsProgressBar;)V
a=0;//     .locals 5
a=0;//     .param p1, "horizontalProgressBar"    # Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;//     .param p2, "spinnyProgressBar"    # Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     .line 744
a=0;//     #v4=(PosByte);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mFeatures:I
a=0;// 
a=0;//     .line 745
a=0;//     .local v1, "features":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     const v3, 0x10a0001
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 746
a=0;//     .local v0, "anim":Landroid/view/animation/Animation;
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 747
a=0;//     and-int/lit8 v2, v1, 0x20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 748
a=0;//     invoke-virtual {p2}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 749
a=0;//     invoke-virtual {p2, v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 750
a=0;//     invoke-virtual {p2, v4}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 752
a=0;//     :cond_0
a=0;//     and-int/lit8 v2, v1, 0x4
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 753
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 754
a=0;//     invoke-virtual {p1, v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 755
a=0;//     invoke-virtual {p1, v4}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 757
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initActionBar()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->installDecor()V
a=0;// 
a=0;//     .line 141
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->hasFeature(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->hasFeature(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->isChild()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 151
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 145
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mFeatures:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;-><init>(Landroid/app/Activity;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     .line 147
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mIsDelegate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setWindowTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private initializePanelMenu()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 552
a=0;//     #v6=(One);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 555
a=0;//     .local v0, "context":Landroid/content/Context;
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 556
a=0;//     new-instance v3, Landroid/util/TypedValue;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 557
a=0;//     .local v3, "outValue":Landroid/util/TypedValue;
a=0;//     #v3=(Reference,Landroid/util/TypedValue;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 558
a=0;//     .local v2, "currentTheme":Landroid/content/res/Resources$Theme;
a=0;//     #v2=(Reference,Landroid/content/res/Resources$Theme;);
a=0;//     sget v5, Lcom/actionbarsherlock/R$attr;->actionBarWidgetTheme:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v5, v3, v6}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
a=0;// 
a=0;//     .line 560
a=0;//     iget v4, v3, Landroid/util/TypedValue;->resourceId:I
a=0;// 
a=0;//     .line 562
a=0;//     .local v4, "targetThemeRes":I
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 563
a=0;//     new-instance v1, Landroid/view/ContextThemeWrapper;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/ContextThemeWrapper;);
a=0;//     invoke-direct {v1, v0, v4}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .end local v0    # "context":Landroid/content/Context;
a=0;//     .local v1, "context":Landroid/content/Context;
a=0;//     #v1=(Reference,Landroid/view/ContextThemeWrapper;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 567
a=0;//     .end local v1    # "context":Landroid/content/Context;
a=0;//     .end local v2    # "currentTheme":Landroid/content/res/Resources$Theme;
a=0;//     .end local v3    # "outValue":Landroid/util/TypedValue;
a=0;//     .end local v4    # "targetThemeRes":I
a=0;//     .restart local v0    # "context":Landroid/content/Context;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v5, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     invoke-direct {v5, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     iput-object v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 568
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v5, p0}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->setCallback(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$Callback;)V
a=0;// 
a=0;//     .line 570
a=0;//     return v6
a=0;// .end method
a=0;// 
a=0;// .method private installDecor()V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 897
a=0;//     #v9=(Null);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 898
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const v10, 0x1020002
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     check-cast v8, Landroid/view/ViewGroup;
a=0;// 
a=0;//     iput-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 900
a=0;//     :cond_0
a=0;//     #v10=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     if-nez v8, :cond_3
a=0;// 
a=0;//     .line 905
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 906
a=0;//     .local v7, "views":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
a=0;//     #v7=(Null);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_1
a=0;// 
a=0;//     .line 907
a=0;//     new-instance v7, Ljava/util/ArrayList;
a=0;// 
a=0;//     .end local v7    # "views":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
a=0;//     #v7=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 908
a=0;//     .restart local v7    # "views":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     #v2=(Null);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v8}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .local v1, "children":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);
a=0;//     if-lt v2, v1, :cond_4
a=0;// 
a=0;//     .line 915
a=0;//     .end local v1    # "children":I
a=0;//     .end local v2    # "i":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v8=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->generateLayout()Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/ViewGroup;);
a=0;//     iput-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 918
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 919
a=0;//     invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_5
a=0;// 
a=0;//     .line 924
a=0;//     :cond_2
a=0;//     #v10=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     const v10, 0x1020016
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v8, v10}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     check-cast v8, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 925
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     if-eqz v8, :cond_7
a=0;// 
a=0;//     .line 926
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->hasFeature(I)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     .line 927
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/TextView;);
a=0;//     const/16 v9, 0x8
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 928
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     instance-of v8, v8, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 929
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/ViewGroup;);
a=0;//     check-cast v8, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v8, v9}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 991
a=0;//     .end local v7    # "views":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 909
a=0;//     .restart local v1    # "children":I
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v7    # "views":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
a=0;//     :cond_4
a=0;//     #v1=(Integer);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Uninit);v7=(Reference,Ljava/util/ArrayList;);v8=(Reference,Landroid/view/ViewGroup;);v9=(Null);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 910
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 911
a=0;//     invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 908
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 919
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v1    # "children":I
a=0;//     .end local v2    # "i":I
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v10=(Boolean);
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 920
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     iget-object v10, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v10=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 932
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v8=(Boolean);v10=(Integer);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 935
a=0;//     :cond_7
a=0;//     #v9=(Null);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     sget v10, Lcom/actionbarsherlock/R$id;->abs__action_bar:I
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     check-cast v8, Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     iput-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     .line 936
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 937
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v8, p0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setWindowCallback(Lcom/actionbarsherlock/view/Window$Callback;)V
a=0;// 
a=0;//     .line 938
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-nez v8, :cond_8
a=0;// 
a=0;//     .line 939
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     iget-object v10, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v10}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setWindowTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 941
a=0;//     :cond_8
a=0;//     #v10=(Conflicted);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {p0, v8}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->hasFeature(I)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     .line 942
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v8}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->initProgress()V
a=0;// 
a=0;//     .line 944
a=0;//     :cond_9
a=0;//     #v8=(Conflicted);
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {p0, v8}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->hasFeature(I)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_a
a=0;// 
a=0;//     .line 945
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v8}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->initIndeterminateProgress()V
a=0;// 
a=0;//     .line 949
a=0;//     :cond_a
a=0;//     #v8=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v8=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v8}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->loadUiOptionsFromManifest(Landroid/app/Activity;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 950
a=0;//     .local v6, "uiOptions":I
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_b
a=0;// 
a=0;//     .line 951
a=0;//     iput v6, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mUiOptions:I
a=0;// 
a=0;//     .line 954
a=0;//     :cond_b
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 955
a=0;//     .local v3, "splitActionBar":Z
a=0;//     #v3=(Null);
a=0;//     iget v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mUiOptions:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     and-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     if-eqz v8, :cond_d
a=0;// 
a=0;//     .line 956
a=0;//     .local v5, "splitWhenNarrow":Z
a=0;//     :goto_3
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_e
a=0;// 
a=0;//     .line 957
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v8=(Reference,Landroid/app/Activity;);
a=0;//     sget v9, Lcom/actionbarsherlock/R$bool;->abs__split_action_bar_is_narrow:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v8, v9}, Lcom/actionbarsherlock/internal/ResourcesCompat;->getResources_getBoolean(Landroid/content/Context;I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 963
a=0;//     :goto_4
a=0;//     #v3=(Boolean);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     sget v9, Lcom/actionbarsherlock/R$id;->abs__split_action_bar:I
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     .line 964
a=0;//     .local v4, "splitView":Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;//     if-eqz v4, :cond_f
a=0;// 
a=0;//     .line 965
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v8, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setSplitView(Lcom/actionbarsherlock/internal/widget/ActionBarContainer;)V
a=0;// 
a=0;//     .line 966
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v8, v3}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setSplitActionBar(Z)V
a=0;// 
a=0;//     .line 967
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v8, v5}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setSplitWhenNarrow(Z)V
a=0;// 
a=0;//     .line 969
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     sget v9, Lcom/actionbarsherlock/R$id;->abs__action_context_bar:I
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     check-cast v8, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     iput-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     .line 970
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     invoke-virtual {v8, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->setSplitView(Lcom/actionbarsherlock/internal/widget/ActionBarContainer;)V
a=0;// 
a=0;//     .line 971
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     invoke-virtual {v8, v3}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->setSplitActionBar(Z)V
a=0;// 
a=0;//     .line 972
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     invoke-virtual {v8, v5}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->setSplitWhenNarrow(Z)V
a=0;// 
a=0;//     .line 979
a=0;//     :cond_c
a=0;//     :goto_5
a=0;//     #v9=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     new-instance v9, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$1;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$1;);
a=0;//     invoke-direct {v9, p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$1;-><init>(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$1;);
a=0;//     invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .end local v4    # "splitView":Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;//     .end local v5    # "splitWhenNarrow":Z
a=0;//     :cond_d
a=0;//     #v3=(Null);v4=(Uninit);v5=(One);v8=(Integer);v9=(Null);
a=0;//     move v5, v9
a=0;// 
a=0;//     .line 955
a=0;//     #v5=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 959
a=0;//     .restart local v5    # "splitWhenNarrow":Z
a=0;//     :cond_e
a=0;//     #v5=(Boolean);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v8=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v8}, Landroid/app/Activity;->getTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 960
a=0;//     sget-object v10, Lcom/actionbarsherlock/R$styleable;->SherlockTheme:[I
a=0;// 
a=0;//     #v10=(Reference,[I);
a=0;//     invoke-virtual {v8, v10}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 961
a=0;//     const/16 v10, 0x3f
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v8, v10, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 959
a=0;//     #v3=(Boolean);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 973
a=0;//     .restart local v4    # "splitView":Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;//     :cond_f
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);v9=(Integer);v10=(Conflicted);
a=0;//     if-eqz v3, :cond_c
a=0;// 
a=0;//     .line 974
a=0;//     const-string v8, "ActionBarSherlock"
a=0;// 
a=0;//     const-string v9, "Requested split action bar with incompatible window decor! Ignoring request."
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method private isReservingOverflow()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1078
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mReserveOverflowSet:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1079
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->reserveOverflow(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mReserveOverflow:Z
a=0;// 
a=0;//     .line 1080
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mReserveOverflowSet:Z
a=0;// 
a=0;//     .line 1082
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mReserveOverflow:Z
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static loadUiOptionsFromManifest(Landroid/app/Activity;)I
a=0;//     .locals 15
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1086
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 1088
a=0;//     .local v11, "uiOptions":I
a=0;//     :try_start_0
a=0;//     #v11=(Null);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 1091
a=0;//     .local v10, "thisPackage":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     iget-object v9, v13, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 1092
a=0;//     .local v9, "packageName":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-virtual {p0, v9, v13}, Landroid/app/Activity;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v13}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1093
a=0;//     .local v2, "am":Landroid/content/res/AssetManager;
a=0;//     #v2=(Reference,Landroid/content/res/AssetManager;);
a=0;//     const-string v13, "AndroidManifest.xml"
a=0;// 
a=0;//     invoke-virtual {v2, v13}, Landroid/content/res/AssetManager;->openXmlResourceParser(Ljava/lang/String;)Landroid/content/res/XmlResourceParser;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 1095
a=0;//     .local v12, "xml":Landroid/content/res/XmlResourceParser;
a=0;//     #v12=(Reference,Landroid/content/res/XmlResourceParser;);
a=0;//     invoke-interface {v12}, Landroid/content/res/XmlResourceParser;->getEventType()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1096
a=0;//     .local v5, "eventType":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Integer);v13=(Conflicted);v14=(Conflicted);
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     if-ne v5, v13, :cond_0
a=0;// 
a=0;//     .line 1153
a=0;//     .end local v2    # "am":Landroid/content/res/AssetManager;
a=0;//     .end local v5    # "eventType":I
a=0;//     .end local v9    # "packageName":Ljava/lang/String;
a=0;//     .end local v10    # "thisPackage":Ljava/lang/String;
a=0;//     .end local v12    # "xml":Landroid/content/res/XmlResourceParser;
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return v11
a=0;// 
a=0;//     .line 1097
a=0;//     .restart local v2    # "am":Landroid/content/res/AssetManager;
a=0;//     .restart local v5    # "eventType":I
a=0;//     .restart local v9    # "packageName":Ljava/lang/String;
a=0;//     .restart local v10    # "thisPackage":Ljava/lang/String;
a=0;//     .restart local v12    # "xml":Landroid/content/res/XmlResourceParser;
a=0;//     :cond_0
a=0;//     #v2=(Reference,Landroid/content/res/AssetManager;);v4=(Uninit);v5=(Integer);v9=(Reference,Ljava/lang/String;);v10=(Reference,Ljava/lang/String;);v12=(Reference,Landroid/content/res/XmlResourceParser;);v13=(One);
a=0;//     const/4 v13, 0x2
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     if-ne v5, v13, :cond_1
a=0;// 
a=0;//     .line 1098
a=0;//     invoke-interface {v12}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1100
a=0;//     .local v8, "name":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "application"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_4
a=0;// 
a=0;//     .line 1104
a=0;//     invoke-interface {v12}, Landroid/content/res/XmlResourceParser;->getAttributeCount()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-int/lit8 v6, v13, -0x1
a=0;// 
a=0;//     .local v6, "i":I
a=0;//     :goto_2
a=0;//     #v6=(Integer);
a=0;//     if-gez v6, :cond_2
a=0;// 
a=0;//     .line 1147
a=0;//     .end local v6    # "i":I
a=0;//     .end local v8    # "name":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     #v6=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v12}, Landroid/content/res/XmlResourceParser;->nextToken()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1107
a=0;//     .restart local v6    # "i":I
a=0;//     .restart local v8    # "name":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v6=(Integer);v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "uiOptions"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v12, v6}, Landroid/content/res/XmlResourceParser;->getAttributeName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_3
a=0;// 
a=0;//     .line 1108
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-interface {v12, v6, v13}, Landroid/content/res/XmlResourceParser;->getAttributeIntValue(II)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 1109
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1104
a=0;//     :cond_3
a=0;//     #v13=(Boolean);
a=0;//     add-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1112
a=0;//     .end local v6    # "i":I
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);v14=(Conflicted);
a=0;//     const-string v13, "activity"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_1
a=0;// 
a=0;//     .line 1115
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1116
a=0;//     .local v1, "activityUiOptions":Ljava/lang/Integer;
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1117
a=0;//     .local v0, "activityPackage":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1119
a=0;//     .local v7, "isOurActivity":Z
a=0;//     #v7=(Null);
a=0;//     invoke-interface {v12}, Landroid/content/res/XmlResourceParser;->getAttributeCount()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-int/lit8 v6, v13, -0x1
a=0;// 
a=0;//     .restart local v6    # "i":I
a=0;//     :goto_4
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/Integer;);v6=(Integer);v7=(Boolean);
a=0;//     if-gez v6, :cond_6
a=0;// 
a=0;//     .line 1140
a=0;//     :cond_5
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1123
a=0;//     :cond_6
a=0;//     invoke-interface {v12, v6}, Landroid/content/res/XmlResourceParser;->getAttributeName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1124
a=0;//     .local v3, "attrName":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "uiOptions"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_9
a=0;// 
a=0;//     .line 1125
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-interface {v12, v6, v13}, Landroid/content/res/XmlResourceParser;->getAttributeIntValue(II)I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1135
a=0;//     :cond_7
a=0;//     :goto_5
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 1137
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 1119
a=0;//     :cond_8
a=0;//     add-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1126
a=0;//     :cond_9
a=0;//     #v13=(Boolean);
a=0;//     const-string v13, "name"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_7
a=0;// 
a=0;//     .line 1127
a=0;//     invoke-interface {v12, v6}, Landroid/content/res/XmlResourceParser;->getAttributeValue(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v13}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->cleanActivityName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1128
a=0;//     invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_5
a=0;// 
a=0;//     .line 1131
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 1149
a=0;//     .end local v0    # "activityPackage":Ljava/lang/String;
a=0;//     .end local v1    # "activityUiOptions":Ljava/lang/Integer;
a=0;//     .end local v2    # "am":Landroid/content/res/AssetManager;
a=0;//     .end local v3    # "attrName":Ljava/lang/String;
a=0;//     .end local v5    # "eventType":I
a=0;//     .end local v6    # "i":I
a=0;//     .end local v7    # "isOurActivity":Z
a=0;//     .end local v8    # "name":Ljava/lang/String;
a=0;//     .end local v9    # "packageName":Ljava/lang/String;
a=0;//     .end local v10    # "thisPackage":Ljava/lang/String;
a=0;//     .end local v12    # "xml":Landroid/content/res/XmlResourceParser;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 1150
a=0;//     .local v4, "e":Ljava/lang/Exception;
a=0;//     #v4=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private onIntChanged(II)V
a=0;//     .locals 1
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 681
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     .line 682
a=0;//     :cond_0
a=0;//     invoke-direct {p0, p2}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->updateProgressBars(I)V
a=0;// 
a=0;//     .line 684
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private preparePanel()Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 458
a=0;//     #v1=(Null);
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuIsPrepared:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 525
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 463
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(One);v3=(Boolean);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuRefreshContent:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 464
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 465
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->initializePanelMenu()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 470
a=0;//     :cond_3
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 471
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v3, v4, p0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     .line 478
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V
a=0;// 
a=0;//     .line 479
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->callbackCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     .line 481
a=0;//     iput-object v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 483
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 485
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v2, v5, p0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 491
a=0;//     :cond_5
a=0;//     #v2=(One);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuRefreshContent:Z
a=0;// 
a=0;//     .line 498
a=0;//     :cond_6
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V
a=0;// 
a=0;//     .line 502
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 503
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->restoreActionViewStates(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 504
a=0;//     iput-object v5, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 507
a=0;//     :cond_7
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->callbackPrepareOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_9
a=0;// 
a=0;//     .line 508
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     .line 511
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v2, v5, p0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     .line 513
a=0;//     :cond_8
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 518
a=0;//     :cond_9
a=0;//     #v2=(One);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-static {v3}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 519
a=0;//     .local v0, "kmap":Landroid/view/KeyCharacterMap;
a=0;//     #v0=(Reference,Landroid/view/KeyCharacterMap;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0}, Landroid/view/KeyCharacterMap;->getKeyboardType()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v4, v2, :cond_a
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v3, v1}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->setQwertyMode(Z)V
a=0;// 
a=0;//     .line 520
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V
a=0;// 
a=0;//     .line 523
a=0;//     iput-boolean v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuIsPrepared:Z
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 525
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private reopenMenu(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "toggleMenuMode"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 537
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->isOverflowReserved()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 538
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->isOverflowMenuShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     .line 539
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 540
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->callbackPrepareOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 541
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->showOverflowMenu()Z
a=0;// 
a=0;//     .line 549
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 545
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->hideOverflowMenu()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setFeatureInt(II)V
a=0;//     .locals 1
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 661
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->updateInt(IIZ)V
a=0;// 
a=0;//     .line 662
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private showProgressBars(Lcom/actionbarsherlock/internal/widget/IcsProgressBar;Lcom/actionbarsherlock/internal/widget/IcsProgressBar;)V
a=0;//     .locals 4
a=0;//     .param p1, "horizontalProgressBar"    # Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;//     .param p2, "spinnyProgressBar"    # Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 731
a=0;//     #v3=(Null);
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mFeatures:I
a=0;// 
a=0;//     .line 732
a=0;//     .local v0, "features":I
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, v0, 0x20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 733
a=0;//     invoke-virtual {p2}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 734
a=0;//     invoke-virtual {p2, v3}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 737
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     and-int/lit8 v1, v0, 0x4
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 738
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getProgress()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/16 v2, 0x2710
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 739
a=0;//     invoke-virtual {p1, v3}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 741
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private updateInt(IIZ)V
a=0;//     .locals 2
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "value"    # I
a=0;//     .param p3, "fromResume"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 667
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 678
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 671
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     shl-int v0, v1, p1
a=0;// 
a=0;//     .line 673
a=0;//     .local v0, "featureMask":I
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->getFeatures()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v1, v0
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 677
a=0;//     :cond_2
a=0;//     invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->onIntChanged(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private updateProgressBars(I)V
a=0;//     .locals 10
a=0;//     .param p1, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v9, 0x8
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/16 v8, 0x2710
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 687
a=0;//     #v5=(Null);
a=0;//     invoke-direct {p0, v7}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->getCircularProgressBar(Z)Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 688
a=0;//     .local v0, "circularProgressBar":Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar;);
a=0;//     invoke-direct {p0, v7}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->getHorizontalProgressBar(Z)Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 690
a=0;//     .local v2, "horizontalProgressBar":Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar;);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mFeatures:I
a=0;// 
a=0;//     .line 691
a=0;//     .local v1, "features":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ne p1, v6, :cond_4
a=0;// 
a=0;//     .line 692
a=0;//     and-int/lit8 v6, v1, 0x4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 693
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getProgress()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 694
a=0;//     .local v3, "level":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->isIndeterminate()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     if-ge v3, v8, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 696
a=0;//     .local v4, "visibility":I
a=0;//     :goto_0
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v2, v4}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 698
a=0;//     .end local v3    # "level":I
a=0;//     .end local v4    # "visibility":I
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v6=(Integer);
a=0;//     and-int/lit8 v6, v1, 0x20
a=0;// 
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 699
a=0;//     invoke-virtual {v0, v5}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 728
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v5=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 695
a=0;//     .restart local v3    # "level":I
a=0;//     :cond_3
a=0;//     #v3=(Integer);v4=(Uninit);v5=(Null);v6=(Boolean);
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 701
a=0;//     .end local v3    # "level":I
a=0;//     :cond_4
a=0;//     #v3=(Uninit);v4=(Uninit);v6=(Byte);
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     if-ne p1, v6, :cond_6
a=0;// 
a=0;//     .line 702
a=0;//     and-int/lit8 v5, v1, 0x4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 703
a=0;//     invoke-virtual {v2, v9}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 705
a=0;//     :cond_5
a=0;//     and-int/lit8 v5, v1, 0x20
a=0;// 
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 706
a=0;//     invoke-virtual {v0, v9}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 708
a=0;//     :cond_6
a=0;//     #v5=(Null);
a=0;//     const/4 v6, -0x3
a=0;// 
a=0;//     if-ne p1, v6, :cond_7
a=0;// 
a=0;//     .line 709
a=0;//     invoke-virtual {v2, v7}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setIndeterminate(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 710
a=0;//     :cond_7
a=0;//     const/4 v6, -0x4
a=0;// 
a=0;//     if-ne p1, v6, :cond_8
a=0;// 
a=0;//     .line 711
a=0;//     invoke-virtual {v2, v5}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setIndeterminate(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 712
a=0;//     :cond_8
a=0;//     if-ltz p1, :cond_a
a=0;// 
a=0;//     if-gt p1, v8, :cond_a
a=0;// 
a=0;//     .line 716
a=0;//     add-int/lit8 v5, p1, 0x0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v5}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setProgress(I)V
a=0;// 
a=0;//     .line 718
a=0;//     if-ge p1, v8, :cond_9
a=0;// 
a=0;//     .line 719
a=0;//     invoke-direct {p0, v2, v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->showProgressBars(Lcom/actionbarsherlock/internal/widget/IcsProgressBar;Lcom/actionbarsherlock/internal/widget/IcsProgressBar;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 721
a=0;//     :cond_9
a=0;//     invoke-direct {p0, v2, v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->hideProgressBars(Lcom/actionbarsherlock/internal/widget/IcsProgressBar;Lcom/actionbarsherlock/internal/widget/IcsProgressBar;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 723
a=0;//     :cond_a
a=0;//     #v5=(Null);
a=0;//     const/16 v5, 0x4e20
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     if-gt v5, p1, :cond_2
a=0;// 
a=0;//     const/16 v5, 0x7530
a=0;// 
a=0;//     if-gt p1, v5, :cond_2
a=0;// 
a=0;//     .line 724
a=0;//     add-int/lit16 v5, p1, -0x4e20
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v5}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setSecondaryProgress(I)V
a=0;// 
a=0;//     .line 726
a=0;//     invoke-direct {p0, v2, v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->showProgressBars(Lcom/actionbarsherlock/internal/widget/IcsProgressBar;Lcom/actionbarsherlock/internal/widget/IcsProgressBar;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "params"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 886
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 887
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->installDecor()V
a=0;// 
a=0;//     .line 889
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 891
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->initActionBar()V
a=0;// 
a=0;//     .line 892
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method checkCloseActionMenu(Lcom/actionbarsherlock/view/Menu;)V
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 574
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mClosingActionMenu:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 585
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 578
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mClosingActionMenu:Z
a=0;// 
a=0;//     .line 579
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->dismissPopupMenus()V
a=0;// 
a=0;//     .line 584
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mClosingActionMenu:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchCloseOptionsMenu()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 291
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->isReservingOverflow()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 298
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 295
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->hideOverflowMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 1
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 223
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchCreateOptionsMenu(Landroid/view/Menu;)Z
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 435
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mIsDestroyed:Z
a=0;// 
a=0;//     .line 436
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchInvalidateOptionsMenu()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 257
a=0;//     .local v0, "savedActionViewStates":Landroid/os/Bundle;
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 258
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     .end local v0    # "savedActionViewStates":Landroid/os/Bundle;
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 259
a=0;//     .restart local v0    # "savedActionViewStates":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->saveActionViewStates(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 260
a=0;//     invoke-virtual {v0}, Landroid/os/Bundle;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 261
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 264
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->clear()V
a=0;// 
a=0;//     .line 267
a=0;//     :cond_1
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuRefreshContent:Z
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 271
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuIsPrepared:Z
a=0;// 
a=0;//     .line 272
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->preparePanel()Z
a=0;// 
a=0;//     .line 274
a=0;//     :cond_2
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
a=0;//     .locals 4
a=0;//     .param p1, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 404
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 408
a=0;//     .local v1, "keyCode":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v1, v3, :cond_2
a=0;// 
a=0;//     .line 409
a=0;//     invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 411
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/view/ActionMode;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 412
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 413
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/view/ActionMode;->finish()V
a=0;// 
a=0;//     .line 430
a=0;//     .end local v0    # "action":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 420
a=0;//     .restart local v0    # "action":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(One);v3=(Reference,Lcom/actionbarsherlock/view/ActionMode;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->hasExpandedActionView()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 421
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 422
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->collapseActionView()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 430
a=0;//     .end local v0    # "action":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchMenuOpened(ILandroid/view/Menu;)Z
a=0;//     .locals 2
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 364
a=0;//     #v0=(One);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq p1, v1, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     .line 365
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 366
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->dispatchMenuVisibilityChanged(Z)V
a=0;// 
a=0;//     .line 371
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchOpenOptionsMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->isReservingOverflow()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 281
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 284
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->showOverflowMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;//     .locals 2
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Native callback invoked. Create a test case and report!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPanelClosed(ILandroid/view/Menu;)V
a=0;//     .locals 2
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 378
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 379
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 380
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->dispatchMenuVisibilityChanged(Z)V
a=0;// 
a=0;//     .line 383
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->isOverflowMenuShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->hideOverflowMenu()Z
a=0;// 
a=0;//     .line 241
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPostCreate(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 305
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mIsDelegate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 306
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mIsTitleReady:Z
a=0;// 
a=0;//     .line 309
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 310
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->initActionBar()V
a=0;// 
a=0;//     .line 312
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPostResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setShowHideAnimationEnabled(Z)V
a=0;// 
a=0;//     .line 232
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPrepareOptionsMenu(Landroid/view/Menu;)Z
a=0;//     .locals 3
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 327
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/view/ActionMode;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 352
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 331
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Reference,Lcom/actionbarsherlock/view/ActionMode;);v2=(Uninit);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuIsPrepared:Z
a=0;// 
a=0;//     .line 332
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->preparePanel()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 336
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->isReservingOverflow()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 340
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mNativeItemMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 341
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mNativeItemMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 346
a=0;//     :goto_1
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 350
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mNativeItemMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1, p1, p0, v2}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->bindNativeOverflow(Landroid/view/Menu;Landroid/view/MenuItem$OnMenuItemClickListener;Ljava/util/HashMap;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 352
a=0;//     .local v0, "result":Z
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 343
a=0;//     .end local v0    # "result":Z
a=0;//     :cond_2
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mNativeItemMap:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public dispatchRestoreInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 449
a=0;//     const-string v0, "sherlock:Panels"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/Bundle;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 450
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchSaveInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "outState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 440
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 441
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 442
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->saveActionViewStates(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 444
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const-string v0, "sherlock:Panels"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mMenuFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 445
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchStop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 247
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 248
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setShowHideAnimationEnabled(Z)V
a=0;// 
a=0;//     .line 250
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchTitleChanged(Ljava/lang/CharSequence;I)V
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "color"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 389
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mIsDelegate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mIsTitleReady:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 390
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 391
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 397
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 398
a=0;//     return-void
a=0;// 
a=0;//     .line 392
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 393
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->wActionBar:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setWindowTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getActionBar()Lcom/actionbarsherlock/app/ActionBar;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->initActionBar()V
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getThemedContext()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->getThemedContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasFeature(I)Z
a=0;//     .locals 3
a=0;//     .param p1, "featureId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 802
a=0;//     #v0=(One);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mFeatures:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shl-int v2, v0, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/2addr v1, v2
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 804
a=0;//     .local v0, "result":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 802
a=0;//     .end local v0    # "result":Z
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCloseMenu(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Z)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "allMenusAreClosing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 594
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->checkCloseActionMenu(Lcom/actionbarsherlock/view/Menu;)V
a=0;// 
a=0;//     .line 595
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemClick(Landroid/view/MenuItem;)Z
a=0;//     .locals 4
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 601
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mNativeItemMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 602
a=0;//     .local v0, "sherlockItem":Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 603
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->invoke()Z
a=0;// 
a=0;//     .line 608
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     return v1
a=0;// 
a=0;//     .line 605
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/util/HashMap;);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v1, "ActionBarSherlock"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Options item \""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\" not found in mapping"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemSelected(ILcom/actionbarsherlock/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "item"    # Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 613
a=0;//     invoke-virtual {p0, p2}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->callbackOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemSelected(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "item"    # Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 529
a=0;//     invoke-virtual {p0, p2}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->callbackOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onMenuModeChange(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 533
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->reopenMenu(Z)V
a=0;// 
a=0;//     .line 534
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onOpenSubMenu(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;)Z
a=0;//     .locals 1
a=0;//     .param p1, "subMenu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 589
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public requestFeature(I)Z
a=0;//     .locals 3
a=0;//     .param p1, "featureId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 811
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 812
a=0;//     new-instance v0, Landroid/util/AndroidRuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/AndroidRuntimeException;);
a=0;//     const-string v1, "requestFeature() must be called before adding content"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/AndroidRuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 815
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 826
a=0;//     :pswitch_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 822
a=0;//     :pswitch_1
a=0;//     #v0=(One);v1=(Reference,Landroid/view/ViewGroup;);v2=(Uninit);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mFeatures:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shl-int v2, v0, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     or-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mFeatures:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 815
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setContentView(I)V
a=0;//     .locals 3
a=0;//     .param p1, "layoutResId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 848
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 849
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->installDecor()V
a=0;// 
a=0;//     .line 853
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     .line 855
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 856
a=0;//     .local v0, "callback":Landroid/view/Window$Callback;
a=0;//     #v0=(Reference,Landroid/view/Window$Callback;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 857
a=0;//     invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V
a=0;// 
a=0;//     .line 860
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->initActionBar()V
a=0;// 
a=0;//     .line 861
a=0;//     return-void
a=0;// 
a=0;//     .line 851
a=0;//     .end local v0    # "callback":Landroid/view/Window$Callback;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "params"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 867
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 868
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->installDecor()V
a=0;// 
a=0;//     .line 872
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 874
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 875
a=0;//     .local v0, "callback":Landroid/view/Window$Callback;
a=0;//     #v0=(Reference,Landroid/view/Window$Callback;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 876
a=0;//     invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V
a=0;// 
a=0;//     .line 879
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->initActionBar()V
a=0;// 
a=0;//     .line 880
a=0;//     return-void
a=0;// 
a=0;//     .line 870
a=0;//     .end local v0    # "callback":Landroid/view/Window$Callback;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mContentParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setProgress(I)V
a=0;//     .locals 2
a=0;//     .param p1, "progress"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 649
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     add-int/lit8 v1, p1, 0x0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->setFeatureInt(II)V
a=0;// 
a=0;//     .line 650
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setProgressBarIndeterminate(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "indeterminate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 641
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 642
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x3
a=0;// 
a=0;//     .line 641
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->setFeatureInt(II)V
a=0;// 
a=0;//     .line 643
a=0;//     return-void
a=0;// 
a=0;//     .line 642
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, -0x4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setProgressBarIndeterminateVisibility(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 633
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     .line 634
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 633
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->setFeatureInt(II)V
a=0;// 
a=0;//     .line 635
a=0;//     return-void
a=0;// 
a=0;//     .line 634
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setProgressBarVisibility(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 625
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->setFeatureInt(II)V
a=0;// 
a=0;//     .line 627
a=0;//     return-void
a=0;// 
a=0;//     .line 626
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setSecondaryProgress(I)V
a=0;//     .locals 2
a=0;//     .param p1, "secondaryProgress"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 656
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 657
a=0;//     #v0=(PosByte);
a=0;//     add-int/lit16 v1, p1, 0x4e20
a=0;// 
a=0;//     .line 656
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->setFeatureInt(II)V
a=0;// 
a=0;//     .line 658
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->dispatchTitleChanged(Ljava/lang/CharSequence;I)V
a=0;// 
a=0;//     .line 163
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setUiOptions(I)V
a=0;//     .locals 0
a=0;//     .param p1, "uiOptions"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 834
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mUiOptions:I
a=0;// 
a=0;//     .line 835
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setUiOptions(II)V
a=0;//     .locals 2
a=0;//     .param p1, "uiOptions"    # I
a=0;//     .param p2, "mask"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 841
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mUiOptions:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     xor-int/lit8 v1, p2, -0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     and-int v1, p1, p2
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mUiOptions:I
a=0;// 
a=0;//     .line 842
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startActionMode(Lcom/actionbarsherlock/view/ActionMode$Callback;)Lcom/actionbarsherlock/view/ActionMode;
a=0;//     .locals 6
a=0;//     .param p1, "callback"    # Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/view/ActionMode;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/view/ActionMode;->finish()V
a=0;// 
a=0;//     .line 173
a=0;//     :cond_0
a=0;//     new-instance v2, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;);
a=0;//     invoke-direct {v2, p0, p1}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;-><init>(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;Lcom/actionbarsherlock/view/ActionMode$Callback;)V
a=0;// 
a=0;//     .line 174
a=0;//     .local v2, "wrappedCallback":Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 177
a=0;//     .local v0, "mode":Lcom/actionbarsherlock/view/ActionMode;
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->initActionBar()V
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->aActionBar:Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->startActionMode(Lcom/actionbarsherlock/view/ActionMode$Callback;)Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 182
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionMode;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 183
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     .line 205
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     instance-of v3, v3, Lcom/actionbarsherlock/ActionBarSherlock$OnActionModeStartedListener;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     check-cast v3, Lcom/actionbarsherlock/ActionBarSherlock$OnActionModeStartedListener;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/view/ActionMode;);
a=0;//     invoke-interface {v3, v4}, Lcom/actionbarsherlock/ActionBarSherlock$OnActionModeStartedListener;->onActionModeStarted(Lcom/actionbarsherlock/view/ActionMode;)V
a=0;// 
a=0;//     .line 208
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/view/ActionMode;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 185
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mDecor:Landroid/view/ViewGroup;
a=0;// 
a=0;//     sget v4, Lcom/actionbarsherlock/R$id;->abs__action_mode_bar_stub:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/view/ViewStub;
a=0;// 
a=0;//     .line 187
a=0;//     .local v1, "stub":Landroid/view/ViewStub;
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {v1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     .line 191
a=0;//     .end local v1    # "stub":Landroid/view/ViewStub;
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->killMode()V
a=0;// 
a=0;//     .line 193
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;
a=0;// 
a=0;//     .end local v0    # "mode":Lcom/actionbarsherlock/view/ActionMode;
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/StandaloneActionMode;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-direct {v0, v3, v4, v2, v5}, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;-><init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/widget/ActionBarContextView;Lcom/actionbarsherlock/view/ActionMode$Callback;Z)V
a=0;// 
a=0;//     .line 194
a=0;//     .restart local v0    # "mode":Lcom/actionbarsherlock/view/ActionMode;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/StandaloneActionMode;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/view/ActionMode;->getMenu()Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {p1, v0, v3}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onCreateActionMode(Lcom/actionbarsherlock/view/ActionMode;Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 195
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/view/ActionMode;->invalidate()V
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v3, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->initForMode(Lcom/actionbarsherlock/view/ActionMode;)V
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 198
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionModeView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 201
a=0;//     :cond_6
a=0;//     #v3=(Boolean);v4=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-object v3, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->mActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
