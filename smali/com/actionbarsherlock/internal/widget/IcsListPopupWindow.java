package com.actionbarsherlock.internal.widget; class IcsListPopupWindow { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// .super Ljava/lang/Object;
a=0;// .source "IcsListPopupWindow.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final EXPAND_LIST_TIMEOUT:I = 0xfa
a=0;// 
a=0;// .field public static final POSITION_PROMPT_ABOVE:I = 0x0
a=0;// 
a=0;// .field public static final POSITION_PROMPT_BELOW:I = 0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mDropDownAnchorView:Landroid/view/View;
a=0;// 
a=0;// .field private mDropDownHeight:I
a=0;// 
a=0;// .field private mDropDownHorizontalOffset:I
a=0;// 
a=0;// .field private mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;// .field private mDropDownListHighlight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mDropDownVerticalOffset:I
a=0;// 
a=0;// .field private mDropDownVerticalOffsetSet:Z
a=0;// 
a=0;// .field private mDropDownWidth:I
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private final mHideSelector:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;
a=0;// 
a=0;// .field private mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// .field private mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;// .field private mListItemExpandMaximum:I
a=0;// 
a=0;// .field private mModal:Z
a=0;// 
a=0;// .field private mObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;// .field private mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;// .field private mPromptPosition:I
a=0;// 
a=0;// .field private mPromptView:Landroid/view/View;
a=0;// 
a=0;// .field private final mResizePopupRunnable:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;// .field private final mScrollListener:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;
a=0;// 
a=0;// .field private mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private final mTouchInterceptor:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget v1, Lcom/actionbarsherlock/R$attr;->listPopupWindowStyle:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p1, v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 79
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyleAttr"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 81
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     .line 44
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     .line 49
a=0;//     const v0, 0x7fffffff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mListItemExpandMaximum:I
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPromptPosition:I
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;-><init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mResizePopupRunnable:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;-><init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTouchInterceptor:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;-><init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mScrollListener:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;-><init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mHideSelector:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 70
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 82
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v0, Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/PopupWindow;);
a=0;//     invoke-direct {v0, p1, p2, p3}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyleAttr"    # I
a=0;//     .param p4, "defStyleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 87
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     .line 44
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     .line 49
a=0;//     const v1, 0x7fffffff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mListItemExpandMaximum:I
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPromptPosition:I
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;-><init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mResizePopupRunnable:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;-><init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTouchInterceptor:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;-><init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mScrollListener:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;-><init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mHideSelector:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v1, Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v1}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 70
a=0;//     new-instance v1, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 88
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 89
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v0, Landroid/view/ContextThemeWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/ContextThemeWrapper;);
a=0;//     invoke-direct {v0, p1, p4}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 91
a=0;//     .local v0, "wrapped":Landroid/content/Context;
a=0;//     #v0=(Reference,Landroid/view/ContextThemeWrapper;);
a=0;//     new-instance v1, Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/PopupWindow;);
a=0;//     invoke-direct {v1, v0, p2, p3}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     .line 95
a=0;//     .end local v0    # "wrapped":Landroid/content/Context;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V
a=0;// 
a=0;//     .line 96
a=0;//     return-void
a=0;// 
a=0;//     .line 93
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Integer);v2=(PosByte);
a=0;//     new-instance v1, Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/PopupWindow;);
a=0;//     invoke-direct {v1, p1, p2, p3, p4}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mListItemExpandMaximum:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Landroid/widget/PopupWindow;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mResizePopupRunnable:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->isInputMethodNotNeeded()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private buildDropDown()I
a=0;//     .locals 21
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     .line 287
a=0;//     .local v17, "otherHeights":I
a=0;//     #v17=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     .line 288
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 290
a=0;//     .local v8, "context":Landroid/content/Context;
a=0;//     #v8=(Reference,Landroid/content/Context;);
a=0;//     new-instance v2, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mModal:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-direct {v2, v8, v1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;-><init>(Landroid/content/Context;Z)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     .line 291
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownListHighlight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 292
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownListHighlight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->setSelector(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 294
a=0;//     :cond_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 295
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 296
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->setFocusable(Z)V
a=0;// 
a=0;//     .line 297
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->setFocusableInTouchMode(Z)V
a=0;// 
a=0;//     .line 298
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     new-instance v2, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$1;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$1;-><init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$1;);
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
a=0;// 
a=0;//     .line 314
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mScrollListener:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
a=0;// 
a=0;//     .line 316
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 317
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
a=0;// 
a=0;//     .line 320
a=0;//     :cond_1
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     .line 322
a=0;//     .local v9, "dropDownView":Landroid/view/ViewGroup;
a=0;//     #v9=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPromptView:Landroid/view/View;
a=0;// 
a=0;//     .line 323
a=0;//     .local v13, "hintView":Landroid/view/View;
a=0;//     #v13=(Reference,Landroid/view/View;);
a=0;//     if-eqz v13, :cond_2
a=0;// 
a=0;//     .line 326
a=0;//     new-instance v11, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v11=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v11, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 327
a=0;//     .local v11, "hintContainer":Landroid/widget/LinearLayout;
a=0;//     #v11=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v11, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     .line 329
a=0;//     new-instance v12, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 330
a=0;//     #v12=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 329
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v12, v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V
a=0;// 
a=0;//     .line 333
a=0;//     .local v12, "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v12=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPromptPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 350
a=0;//     :goto_1
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     const/high16 v2, -0x80000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 351
a=0;//     .local v20, "widthSpec":I
a=0;//     #v20=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 352
a=0;//     .local v10, "heightSpec":I
a=0;//     #v10=(Null);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v13, v0, v10}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 354
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .end local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     check-cast v12, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 355
a=0;//     .restart local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iget v2, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 356
a=0;//     iget v2, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     .line 355
a=0;//     add-int v17, v1, v2
a=0;// 
a=0;//     .line 358
a=0;//     #v17=(Integer);
a=0;//     move-object v9, v11
a=0;// 
a=0;//     .line 361
a=0;//     .end local v10    # "heightSpec":I
a=0;//     .end local v11    # "hintContainer":Landroid/widget/LinearLayout;
a=0;//     .end local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .end local v20    # "widthSpec":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v20=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v1, v9}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 375
a=0;//     .end local v8    # "context":Landroid/content/Context;
a=0;//     .end local v13    # "hintView":Landroid/view/View;
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v8=(Conflicted);v13=(Conflicted);v19=(Conflicted);
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     .line 376
a=0;//     .local v18, "padding":I
a=0;//     #v18=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v1}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 377
a=0;//     .local v7, "background":Landroid/graphics/drawable/Drawable;
a=0;//     #v7=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     .line 378
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {v7, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 379
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget v1, v1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v2, v2, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int v18, v1, v2
a=0;// 
a=0;//     .line 383
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownVerticalOffsetSet:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 384
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v1, v1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     neg-int v1, v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownVerticalOffset:I
a=0;// 
a=0;//     .line 390
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v1}, Landroid/widget/PopupWindow;->getInputMethodMode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_7
a=0;// 
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     .line 392
a=0;//     .local v14, "ignoreBottomDecorations":Z
a=0;//     :goto_3
a=0;//     #v14=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownAnchorView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownVerticalOffset:I
a=0;// 
a=0;//     .line 391
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v14}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->getMaxAvailableHeight(Landroid/view/View;IZ)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 394
a=0;//     .local v16, "maxHeight":I
a=0;//     #v16=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v1, v2, :cond_8
a=0;// 
a=0;//     .line 395
a=0;//     add-int v1, v16, v18
a=0;// 
a=0;//     .line 404
a=0;//     :goto_4
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v15=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 290
a=0;//     .end local v7    # "background":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v9    # "dropDownView":Landroid/view/ViewGroup;
a=0;//     .end local v14    # "ignoreBottomDecorations":Z
a=0;//     .end local v16    # "maxHeight":I
a=0;//     .end local v18    # "padding":I
a=0;//     .restart local v8    # "context":Landroid/content/Context;
a=0;//     :cond_5
a=0;//     #v1=(Boolean);v2=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Reference,Landroid/content/Context;);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Null);v18=(Uninit);v19=(Uninit);v20=(Uninit);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 335
a=0;//     .restart local v9    # "dropDownView":Landroid/view/ViewGroup;
a=0;//     .restart local v11    # "hintContainer":Landroid/widget/LinearLayout;
a=0;//     .restart local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .restart local v13    # "hintView":Landroid/view/View;
a=0;//     :pswitch_0
a=0;//     #v1=(Integer);v2=(Null);v3=(Integer);v9=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);v11=(Reference,Landroid/widget/LinearLayout;);v12=(Reference,Landroid/widget/LinearLayout$LayoutParams;);v13=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11, v9, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 336
a=0;//     invoke-virtual {v11, v13}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 340
a=0;//     :pswitch_1
a=0;//     invoke-virtual {v11, v13}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 341
a=0;//     invoke-virtual {v11, v9, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 363
a=0;//     .end local v8    # "context":Landroid/content/Context;
a=0;//     .end local v9    # "dropDownView":Landroid/view/ViewGroup;
a=0;//     .end local v11    # "hintContainer":Landroid/widget/LinearLayout;
a=0;//     .end local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .end local v13    # "hintView":Landroid/view/View;
a=0;//     :cond_6
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);v2=(Uninit);v3=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     check-cast v9, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 364
a=0;//     .restart local v9    # "dropDownView":Landroid/view/ViewGroup;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPromptView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     .line 365
a=0;//     .local v19, "view":Landroid/view/View;
a=0;//     #v19=(Reference,Landroid/view/View;);
a=0;//     if-eqz v19, :cond_3
a=0;// 
a=0;//     .line 367
a=0;//     invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v12, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 368
a=0;//     .restart local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 369
a=0;//     iget v2, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     .line 368
a=0;//     add-int v17, v1, v2
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 390
a=0;//     .end local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .end local v19    # "view":Landroid/view/View;
a=0;//     .restart local v7    # "background":Landroid/graphics/drawable/Drawable;
a=0;//     .restart local v18    # "padding":I
a=0;//     :cond_7
a=0;//     #v2=(PosByte);v3=(Conflicted);v7=(Reference,Landroid/graphics/drawable/Drawable;);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v18=(Integer);v19=(Conflicted);v20=(Conflicted);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 398
a=0;//     .restart local v14    # "ignoreBottomDecorations":Z
a=0;//     .restart local v16    # "maxHeight":I
a=0;//     :cond_8
a=0;//     #v2=(Byte);v14=(Boolean);v16=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 399
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     sub-int v5, v16, v17
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     .line 398
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->measureHeightOfChildren(IIIII)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 402
a=0;//     .local v15, "listContent":I
a=0;//     #v15=(Integer);
a=0;//     if-lez v15, :cond_9
a=0;// 
a=0;//     add-int v17, v17, v18
a=0;// 
a=0;//     .line 404
a=0;//     :cond_9
a=0;//     add-int v1, v15, v17
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 333
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private getMaxAvailableHeight(Landroid/view/View;IZ)I
a=0;//     .locals 10
a=0;//     .param p1, "anchor"    # Landroid/view/View;
a=0;//     .param p2, "yOffset"    # I
a=0;//     .param p3, "ignoreBottomDecorations"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     .line 408
a=0;//     #v9=(One);
a=0;//     new-instance v2, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .line 409
a=0;//     .local v2, "displayFrame":Landroid/graphics/Rect;
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 411
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v0, v7, [I
a=0;// 
a=0;//     .line 412
a=0;//     .local v0, "anchorPos":[I
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V
a=0;// 
a=0;//     .line 414
a=0;//     iget v1, v2, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     .line 415
a=0;//     .local v1, "bottomEdge":I
a=0;//     #v1=(Integer);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 416
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 417
a=0;//     .local v5, "res":Landroid/content/res/Resources;
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget v1, v7, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     .line 419
a=0;//     .end local v5    # "res":Landroid/content/res/Resources;
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);v7=(Conflicted);
a=0;//     aget v7, v0, v9
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     add-int/2addr v7, v8
a=0;// 
a=0;//     sub-int v7, v1, v7
a=0;// 
a=0;//     sub-int v3, v7, p2
a=0;// 
a=0;//     .line 420
a=0;//     .local v3, "distanceToBottom":I
a=0;//     #v3=(Integer);
a=0;//     aget v7, v0, v9
a=0;// 
a=0;//     iget v8, v2, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     sub-int/2addr v7, v8
a=0;// 
a=0;//     add-int v4, v7, p2
a=0;// 
a=0;//     .line 423
a=0;//     .local v4, "distanceToTop":I
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 424
a=0;//     .local v6, "returnedHeight":I
a=0;//     #v6=(Integer);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v7}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 425
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v7, v8}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 426
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget v7, v7, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget v8, v8, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     add-int/2addr v7, v8
a=0;// 
a=0;//     sub-int/2addr v6, v7
a=0;// 
a=0;//     .line 429
a=0;//     :cond_1
a=0;//     #v7=(Conflicted);
a=0;//     return v6
a=0;// .end method
a=0;// 
a=0;// .method private isInputMethodNotNeeded()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
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
a=0;// .method private measureHeightOfChildren(IIIII)I
a=0;//     .locals 9
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "startPosition"    # I
a=0;//     .param p3, "endPosition"    # I
a=0;//     .param p4, "maxHeight"    # I
a=0;//     .param p5, "disallowPartialChildPosition"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 435
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 436
a=0;//     .local v0, "adapter":Landroid/widget/ListAdapter;
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 437
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v6}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->getListPaddingTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->getListPaddingBottom()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int v4, v6, v7
a=0;// 
a=0;//     .line 485
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Integer);v5=(Conflicted);v8=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 441
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v6}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->getListPaddingTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->getListPaddingBottom()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int v5, v6, v7
a=0;// 
a=0;//     .line 442
a=0;//     .local v5, "returnedHeight":I
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v6}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->getDividerHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_3
a=0;// 
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v6}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->getDivider()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->getDividerHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 445
a=0;//     .local v2, "dividerHeight":I
a=0;//     :goto_1
a=0;//     #v2=(Integer);v6=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 450
a=0;//     .local v4, "prevHeightWithoutPartialChild":I
a=0;//     #v4=(Null);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ne p3, v6, :cond_2
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 p3, v6, -0x1
a=0;// 
a=0;//     .line 452
a=0;//     :cond_2
a=0;//     move v3, p2
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v3=(Integer);v4=(Integer);v8=(Conflicted);
a=0;//     if-le v3, p3, :cond_4
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 485
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 442
a=0;//     .end local v2    # "dividerHeight":I
a=0;//     .end local v3    # "i":I
a=0;//     .end local v4    # "prevHeightWithoutPartialChild":I
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Conflicted);v8=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 453
a=0;//     .restart local v2    # "dividerHeight":I
a=0;//     .restart local v3    # "i":I
a=0;//     .restart local v4    # "prevHeightWithoutPartialChild":I
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Integer);v4=(Integer);v6=(Integer);v8=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/ListAdapter;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     invoke-interface {v6, v3, v7, v8}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 454
a=0;//     .local v1, "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->getCacheColorHint()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     .line 455
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v6}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->getCacheColorHint()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v1, v6}, Landroid/view/View;->setDrawingCacheBackgroundColor(I)V
a=0;// 
a=0;//     .line 458
a=0;//     :cond_5
a=0;//     invoke-direct {p0, v1, v3, p1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->measureScrapChild(Landroid/view/View;II)V
a=0;// 
a=0;//     .line 460
a=0;//     if-lez v3, :cond_6
a=0;// 
a=0;//     .line 462
a=0;//     add-int/2addr v5, v2
a=0;// 
a=0;//     .line 465
a=0;//     :cond_6
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     .line 467
a=0;//     if-lt v5, p4, :cond_8
a=0;// 
a=0;//     .line 470
a=0;//     if-ltz p5, :cond_7
a=0;// 
a=0;//     .line 471
a=0;//     if-le v3, p5, :cond_7
a=0;// 
a=0;//     .line 472
a=0;//     if-lez v4, :cond_7
a=0;// 
a=0;//     .line 473
a=0;//     if-ne v5, p4, :cond_0
a=0;// 
a=0;//     :cond_7
a=0;//     move v4, p4
a=0;// 
a=0;//     .line 475
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 478
a=0;//     :cond_8
a=0;//     if-ltz p5, :cond_9
a=0;// 
a=0;//     if-lt v3, p5, :cond_9
a=0;// 
a=0;//     .line 479
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 452
a=0;//     :cond_9
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private measureScrapChild(Landroid/view/View;II)V
a=0;//     .locals 7
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "position"    # I
a=0;//     .param p3, "widthMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 488
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v3, Landroid/widget/AbsListView$LayoutParams;
a=0;// 
a=0;//     .line 489
a=0;//     .local v3, "p":Landroid/widget/AbsListView$LayoutParams;
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 490
a=0;//     new-instance v3, Landroid/widget/AbsListView$LayoutParams;
a=0;// 
a=0;//     .end local v3    # "p":Landroid/widget/AbsListView$LayoutParams;
a=0;//     #v3=(UninitRef,Landroid/widget/AbsListView$LayoutParams;);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 491
a=0;//     #v4=(Byte);
a=0;//     const/4 v5, -0x2
a=0;// 
a=0;//     .line 490
a=0;//     #v5=(Byte);
a=0;//     invoke-direct {v3, v4, v5, v6}, Landroid/widget/AbsListView$LayoutParams;-><init>(III)V
a=0;// 
a=0;//     .line 492
a=0;//     .restart local v3    # "p":Landroid/widget/AbsListView$LayoutParams;
a=0;//     #v3=(Reference,Landroid/widget/AbsListView$LayoutParams;);
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 498
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     iget v5, v3, Landroid/widget/AbsListView$LayoutParams;->width:I
a=0;// 
a=0;//     .line 497
a=0;//     invoke-static {p3, v4, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 499
a=0;//     .local v1, "childWidthSpec":I
a=0;//     #v1=(Integer);
a=0;//     iget v2, v3, Landroid/widget/AbsListView$LayoutParams;->height:I
a=0;// 
a=0;//     .line 501
a=0;//     .local v2, "lpHeight":I
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 502
a=0;//     const/high16 v4, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 506
a=0;//     .local v0, "childHeightSpec":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 507
a=0;//     return-void
a=0;// 
a=0;//     .line 504
a=0;//     .end local v0    # "childHeightSpec":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .restart local v0    # "childHeightSpec":I
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clearListSelection()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     .line 263
a=0;//     .local v0, "list":Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 265
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->access$0(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;Z)V
a=0;// 
a=0;//     .line 267
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->requestLayout()V
a=0;// 
a=0;//     .line 269
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dismiss()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 240
a=0;//     #v3=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v2}, Landroid/widget/PopupWindow;->dismiss()V
a=0;// 
a=0;//     .line 241
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPromptView:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPromptView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 243
a=0;//     .local v1, "parent":Landroid/view/ViewParent;
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);
a=0;//     instance-of v2, v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 244
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 245
a=0;//     .local v0, "group":Landroid/view/ViewGroup;
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPromptView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 248
a=0;//     .end local v0    # "group":Landroid/view/ViewGroup;
a=0;//     .end local v1    # "parent":Landroid/view/ViewParent;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 249
a=0;//     iput-object v3, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mResizePopupRunnable:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 251
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getListView()Landroid/widget/ListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isShowing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 272
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/ListAdapter;)V
a=0;//     .locals 2
a=0;//     .param p1, "adapter"    # Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/DataSetObserver;);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 100
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;-><init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     invoke-interface {p1, v0}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 109
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ListAdapter;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 112
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 101
a=0;//     :cond_3
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/DataSetObserver;);
a=0;//     invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAnchorView(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "anchor"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownAnchorView:Landroid/view/View;
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 125
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentWidth(I)V
a=0;//     .locals 3
a=0;//     .param p1, "width"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v1}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 142
a=0;//     .local v0, "popupBackground":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget v1, v1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v2, v2, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     add-int/2addr v1, p1
a=0;// 
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     .line 148
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 146
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);v2=(Uninit);
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setHorizontalOffset(I)V
a=0;//     .locals 0
a=0;//     .param p1, "offset"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownHorizontalOffset:I
a=0;// 
a=0;//     .line 133
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setInputMethodMode(I)V
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V
a=0;// 
a=0;//     .line 259
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setModal(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "modal"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mModal:Z
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V
a=0;// 
a=0;//     .line 121
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/widget/PopupWindow$OnDismissListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
a=0;// 
a=0;//     .line 255
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     .local p1, "clickListener":Landroid/widget/AdapterView$OnItemClickListener;, "Landroid/widget/AdapterView$OnItemClickListener;"
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPromptPosition(I)V
a=0;//     .locals 0
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPromptPosition:I
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setVerticalOffset(I)V
a=0;//     .locals 1
a=0;//     .param p1, "offset"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownVerticalOffset:I
a=0;// 
a=0;//     .line 137
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownVerticalOffsetSet:Z
a=0;// 
a=0;//     .line 138
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 155
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->buildDropDown()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 157
a=0;//     .local v6, "height":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 158
a=0;//     .local v4, "widthSpec":I
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 160
a=0;//     .local v5, "heightSpec":I
a=0;//     #v5=(Null);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->isInputMethodNotNeeded()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 163
a=0;//     .local v7, "noInputMethod":Z
a=0;//     #v7=(Boolean);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     .line 164
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v0, :cond_1
a=0;// 
a=0;//     .line 167
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 174
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Integer);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v0, :cond_7
a=0;// 
a=0;//     .line 177
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 178
a=0;//     :goto_1
a=0;//     #v5=(Integer);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     .line 180
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v0, :cond_4
a=0;// 
a=0;//     .line 179
a=0;//     :goto_2
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V
a=0;// 
a=0;//     .line 194
a=0;//     :goto_3
a=0;//     #v0=(Integer);v1=(Byte);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0, v8}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownAnchorView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownHorizontalOffset:I
a=0;// 
a=0;//     .line 197
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownVerticalOffset:I
a=0;// 
a=0;//     .line 196
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V
a=0;// 
a=0;//     .line 237
a=0;//     :cond_0
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v2=(Conflicted);v8=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 168
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Null);v2=(Integer);v3=(Byte);v4=(Null);v5=(Null);v8=(One);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     if-ne v2, v3, :cond_2
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownAnchorView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 170
a=0;//     #v4=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 171
a=0;//     :cond_2
a=0;//     #v2=(Integer);v4=(Null);
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     move v5, v0
a=0;// 
a=0;//     .line 177
a=0;//     #v5=(Byte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);v3=(Integer);v5=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 181
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 183
a=0;//     :cond_5
a=0;//     #v0=(Byte);v2=(Integer);v3=(Byte);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     .line 184
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v0, :cond_6
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 183
a=0;//     :cond_6
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v2, v1, v0}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 188
a=0;//     :cond_7
a=0;//     #v1=(Null);v2=(Integer);v3=(Byte);v5=(Null);
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v3, :cond_8
a=0;// 
a=0;//     .line 189
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 190
a=0;//     #v5=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 191
a=0;//     :cond_8
a=0;//     #v5=(Null);
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 199
a=0;//     :cond_9
a=0;//     #v0=(Byte);v2=(Boolean);v4=(Null);v5=(Null);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v0, :cond_c
a=0;// 
a=0;//     .line 200
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 209
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);v2=(Integer);v4=(Byte);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v0, :cond_e
a=0;// 
a=0;//     .line 210
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 219
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v5=(Byte);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v1, v4, v5}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V
a=0;// 
a=0;//     .line 225
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mTouchInterceptor:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownAnchorView:Landroid/view/View;
a=0;// 
a=0;//     .line 227
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownHorizontalOffset:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v8, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownVerticalOffset:I
a=0;// 
a=0;//     .line 226
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v1, v2, v3, v8}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->setSelection(I)V
a=0;// 
a=0;//     .line 230
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mModal:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownList:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$DropDownListView;->isInTouchMode()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     .line 231
a=0;//     :cond_a
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->clearListSelection()V
a=0;// 
a=0;//     .line 233
a=0;//     :cond_b
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mModal:Z
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 234
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mHideSelector:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ListSelectorHider;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 202
a=0;//     :cond_c
a=0;//     #v0=(Byte);v1=(Integer);v2=(Boolean);v3=(Byte);v4=(Null);v5=(Null);v8=(One);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     if-ne v1, v3, :cond_d
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownAnchorView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setWidth(I)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 205
a=0;//     :cond_d
a=0;//     #v1=(Integer);v2=(Boolean);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setWidth(I)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 212
a=0;//     :cond_e
a=0;//     #v1=(Integer);v4=(Byte);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     if-ne v1, v3, :cond_f
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v1, v6}, Landroid/widget/PopupWindow;->setHeight(I)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 215
a=0;//     :cond_f
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setHeight(I)V
a=0;// 
a=0;//     goto :goto_6
a=0;// .end method
}}
