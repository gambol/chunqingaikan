package com.twocloo.com.cn.beans; class WheelView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/beans/WheelView;
a=0;// .super Landroid/view/View;
a=0;// .source "WheelView.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ADDITIONAL_ITEMS_SPACE:I = 0xa
a=0;// 
a=0;// .field private static final ADDITIONAL_ITEM_HEIGHT:I = 0xf
a=0;// 
a=0;// .field private static final DEF_VISIBLE_ITEMS:I = 0x5
a=0;// 
a=0;// .field private static final ITEMS_TEXT_COLOR:I = -0x1000000
a=0;// 
a=0;// .field private static final LABEL_OFFSET:I = 0x8
a=0;// 
a=0;// .field private static final MIN_DELTA_FOR_SCROLLING:I = 0x1
a=0;// 
a=0;// .field private static final PADDING:I = 0xa
a=0;// 
a=0;// .field private static final SCROLLING_DURATION:I = 0x190
a=0;// 
a=0;// .field private static final SHADOWS_COLORS:[I
a=0;// 
a=0;// .field private static final VALUE_TEXT_COLOR:I = -0x10000000
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final ITEM_OFFSET:I
a=0;// 
a=0;// .field private final MESSAGE_JUSTIFY:I
a=0;// 
a=0;// .field private final MESSAGE_SCROLL:I
a=0;// 
a=0;// .field public TEXT_SIZE:I
a=0;// 
a=0;// .field private adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;// .field private animationHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private bottomShadow:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;// .field private centerDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private changingListeners:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/OnWheelChangedListener;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private currentItem:I
a=0;// 
a=0;// .field private gestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;// .field private gestureListener:Landroid/view/GestureDetector$SimpleOnGestureListener;
a=0;// 
a=0;// .field isCyclic:Z
a=0;// 
a=0;// .field private isScrollingPerformed:Z
a=0;// 
a=0;// .field private itemHeight:I
a=0;// 
a=0;// .field private itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;// .field private itemsPaint:Landroid/text/TextPaint;
a=0;// 
a=0;// .field private itemsWidth:I
a=0;// 
a=0;// .field private label:Ljava/lang/String;
a=0;// 
a=0;// .field private labelLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;// .field private labelWidth:I
a=0;// 
a=0;// .field private lastScrollY:I
a=0;// 
a=0;// .field private scroller:Landroid/widget/Scroller;
a=0;// 
a=0;// .field private scrollingListeners:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/OnWheelScrollListener;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private scrollingOffset:I
a=0;// 
a=0;// .field private topShadow:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;// .field private valueLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;// .field private valuePaint:Landroid/text/TextPaint;
a=0;// 
a=0;// .field private visibleItems:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/beans/WheelView;->SHADOWS_COLORS:[I
a=0;// 
a=0;//     .line 91
a=0;//     return-void
a=0;// 
a=0;//     .line 69
a=0;//     #v0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         -0xeeeeef
a=0;//         0xaaaaaa
a=0;//         0xaaaaaa
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 160
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 79
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->TEXT_SIZE:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x5
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->ITEM_OFFSET:I
a=0;// 
a=0;//     .line 94
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     .line 95
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     .line 98
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     .line 99
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelWidth:I
a=0;// 
a=0;//     .line 102
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->visibleItems:I
a=0;// 
a=0;//     .line 105
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemHeight:I
a=0;// 
a=0;//     .line 134
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->isCyclic:Z
a=0;// 
a=0;//     .line 137
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->changingListeners:Ljava/util/List;
a=0;// 
a=0;//     .line 138
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingListeners:Ljava/util/List;
a=0;// 
a=0;//     .line 870
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/WheelView$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/WheelView$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/beans/WheelView$1;-><init>(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->gestureListener:Landroid/view/GestureDetector$SimpleOnGestureListener;
a=0;// 
a=0;//     .line 901
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->MESSAGE_SCROLL:I
a=0;// 
a=0;//     .line 902
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->MESSAGE_JUSTIFY:I
a=0;// 
a=0;//     .line 924
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/WheelView$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/WheelView$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/beans/WheelView$2;-><init>(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView$2;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->animationHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 161
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/WheelView;->initData(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 162
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 152
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 79
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->TEXT_SIZE:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x5
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->ITEM_OFFSET:I
a=0;// 
a=0;//     .line 94
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     .line 95
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     .line 98
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     .line 99
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelWidth:I
a=0;// 
a=0;//     .line 102
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->visibleItems:I
a=0;// 
a=0;//     .line 105
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemHeight:I
a=0;// 
a=0;//     .line 134
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->isCyclic:Z
a=0;// 
a=0;//     .line 137
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->changingListeners:Ljava/util/List;
a=0;// 
a=0;//     .line 138
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingListeners:Ljava/util/List;
a=0;// 
a=0;//     .line 870
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/WheelView$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/WheelView$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/beans/WheelView$1;-><init>(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->gestureListener:Landroid/view/GestureDetector$SimpleOnGestureListener;
a=0;// 
a=0;//     .line 901
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->MESSAGE_SCROLL:I
a=0;// 
a=0;//     .line 902
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->MESSAGE_JUSTIFY:I
a=0;// 
a=0;//     .line 924
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/WheelView$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/WheelView$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/beans/WheelView$2;-><init>(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView$2;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->animationHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 153
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/WheelView;->initData(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 154
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 144
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 79
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->TEXT_SIZE:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x5
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->ITEM_OFFSET:I
a=0;// 
a=0;//     .line 94
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     .line 95
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     .line 98
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     .line 99
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelWidth:I
a=0;// 
a=0;//     .line 102
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->visibleItems:I
a=0;// 
a=0;//     .line 105
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemHeight:I
a=0;// 
a=0;//     .line 134
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->isCyclic:Z
a=0;// 
a=0;//     .line 137
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->changingListeners:Ljava/util/List;
a=0;// 
a=0;//     .line 138
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingListeners:Ljava/util/List;
a=0;// 
a=0;//     .line 870
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/WheelView$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/WheelView$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/beans/WheelView$1;-><init>(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->gestureListener:Landroid/view/GestureDetector$SimpleOnGestureListener;
a=0;// 
a=0;//     .line 901
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->MESSAGE_SCROLL:I
a=0;// 
a=0;//     .line 902
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->MESSAGE_JUSTIFY:I
a=0;// 
a=0;//     .line 924
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/WheelView$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/WheelView$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/beans/WheelView$2;-><init>(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView$2;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->animationHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 145
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/WheelView;->initData(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 146
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/beans/WheelView;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->isScrollingPerformed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/beans/WheelView;)Landroid/widget/Scroller;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/beans/WheelView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->lastScrollY:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/com/cn/beans/WheelView;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 910
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/WheelView;->setNextMessage(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/twocloo/com/cn/beans/WheelView;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 924
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->animationHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 953
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->justify()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 918
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->clearMessages()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 981
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->startScrolling()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/beans/WheelView;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 829
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/WheelView;->doScroll(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/beans/WheelView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/beans/WheelView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 555
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getItemHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/beans/WheelView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/beans/WheelView;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/beans/WheelView;->lastScrollY:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/beans/WheelView;)Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private buildText(Z)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p1, "useCurrentValue"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 502
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 503
a=0;//     .local v2, "itemsText":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/beans/WheelView;->visibleItems:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     div-int/lit8 v4, v4, 0x2
a=0;// 
a=0;//     add-int/lit8 v0, v4, 0x1
a=0;// 
a=0;//     .line 505
a=0;//     .local v0, "addItems":I
a=0;//     #v0=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     sub-int v1, v4, v0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v4, v0
a=0;// 
a=0;//     if-le v1, v4, :cond_0
a=0;// 
a=0;//     .line 517
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 506
a=0;//     :cond_0
a=0;//     #v4=(Integer);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     if-eq v1, v4, :cond_2
a=0;// 
a=0;//     .line 507
a=0;//     :cond_1
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/beans/WheelView;->getTextItem(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 508
a=0;//     .local v3, "text":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 509
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 512
a=0;//     .end local v3    # "text":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v4, v0
a=0;// 
a=0;//     if-ge v1, v4, :cond_3
a=0;// 
a=0;//     .line 513
a=0;//     const-string v4, "\n"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 505
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private calculateLayoutWidth(II)I
a=0;//     .locals 11
a=0;//     .param p1, "widthSize"    # I
a=0;//     .param p2, "mode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 576
a=0;//     #v9=(Null);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->initResourcesIfNecessary()V
a=0;// 
a=0;//     .line 578
a=0;//     move v6, p1
a=0;// 
a=0;//     .line 580
a=0;//     .local v6, "width":I
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getMaxTextLength()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 581
a=0;//     .local v0, "maxLength":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     .line 582
a=0;//     const-string v7, "0"
a=0;// 
a=0;//     .line 583
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsPaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     .line 582
a=0;//     #v8=(Reference,Landroid/text/TextPaint;);
a=0;//     invoke-static {v7, v8}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     invoke-static {v7}, Landroid/util/FloatMath;->ceil(F)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 584
a=0;//     .local v5, "textWidth":F
a=0;//     #v5=(Float);
a=0;//     int-to-float v7, v0
a=0;// 
a=0;//     mul-float/2addr v7, v5
a=0;// 
a=0;//     float-to-int v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     .line 588
a=0;//     .end local v5    # "textWidth":F
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, 0xa
a=0;// 
a=0;//     iput v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     .line 590
a=0;//     iput v9, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelWidth:I
a=0;// 
a=0;//     .line 591
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->label:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->label:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lez v7, :cond_0
a=0;// 
a=0;//     .line 592
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->label:Ljava/lang/String;
a=0;// 
a=0;//     .line 593
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelView;->valuePaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     .line 592
a=0;//     #v8=(Reference,Landroid/text/TextPaint;);
a=0;//     invoke-static {v7, v8}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     invoke-static {v7}, Landroid/util/FloatMath;->ceil(F)F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     float-to-int v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelWidth:I
a=0;// 
a=0;//     .line 596
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 597
a=0;//     .local v4, "recalculate":Z
a=0;//     #v4=(Null);
a=0;//     const/high16 v7, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne p2, v7, :cond_6
a=0;// 
a=0;//     .line 598
a=0;//     move v6, p1
a=0;// 
a=0;//     .line 599
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 615
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 617
a=0;//     add-int/lit8 v7, v6, -0x8
a=0;// 
a=0;//     add-int/lit8 v3, v7, -0x14
a=0;// 
a=0;//     .line 618
a=0;//     .local v3, "pureWidth":I
a=0;//     #v3=(Integer);
a=0;//     if-gtz v3, :cond_2
a=0;// 
a=0;//     .line 619
a=0;//     iput v9, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelWidth:I
a=0;// 
a=0;//     iput v9, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     .line 621
a=0;//     :cond_2
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelWidth:I
a=0;// 
a=0;//     if-lez v7, :cond_8
a=0;// 
a=0;//     .line 622
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     int-to-double v7, v7
a=0;// 
a=0;//     #v7=(DoubleLo);v8=(DoubleHi);
a=0;//     int-to-double v9, v3
a=0;// 
a=0;//     #v9=(DoubleLo);v10=(DoubleHi);
a=0;//     mul-double/2addr v7, v9
a=0;// 
a=0;//     .line 623
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget v10, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelWidth:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v9, v10
a=0;// 
a=0;//     int-to-double v9, v9
a=0;// 
a=0;//     .line 622
a=0;//     #v9=(DoubleLo);v10=(DoubleHi);
a=0;//     div-double v1, v7, v9
a=0;// 
a=0;//     .line 624
a=0;//     .local v1, "newWidthItems":D
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     double-to-int v7, v1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     .line 625
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     sub-int v7, v3, v7
a=0;// 
a=0;//     iput v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelWidth:I
a=0;// 
a=0;//     .line 631
a=0;//     .end local v1    # "newWidthItems":D
a=0;//     .end local v3    # "pureWidth":I
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     if-lez v7, :cond_4
a=0;// 
a=0;//     .line 632
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelWidth:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct {p0, v7, v8}, Lcom/twocloo/com/cn/beans/WheelView;->createLayouts(II)V
a=0;// 
a=0;//     .line 635
a=0;//     :cond_4
a=0;//     #v8=(Conflicted);
a=0;//     return v6
a=0;// 
a=0;//     .line 586
a=0;//     .end local v4    # "recalculate":Z
a=0;//     :cond_5
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Null);v10=(Uninit);
a=0;//     iput v9, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 601
a=0;//     .restart local v4    # "recalculate":Z
a=0;//     :cond_6
a=0;//     #v4=(Null);v5=(Conflicted);v7=(Integer);v8=(Conflicted);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelWidth:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     add-int/2addr v7, v8
a=0;// 
a=0;//     add-int/lit8 v6, v7, 0x14
a=0;// 
a=0;//     .line 602
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelWidth:I
a=0;// 
a=0;//     if-lez v7, :cond_7
a=0;// 
a=0;//     .line 603
a=0;//     add-int/lit8 v6, v6, 0x8
a=0;// 
a=0;//     .line 607
a=0;//     :cond_7
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getSuggestedMinimumWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 609
a=0;//     const/high16 v7, -0x80000000
a=0;// 
a=0;//     if-ne p2, v7, :cond_1
a=0;// 
a=0;//     if-ge p1, v6, :cond_1
a=0;// 
a=0;//     .line 610
a=0;//     move v6, p1
a=0;// 
a=0;//     .line 611
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 627
a=0;//     .restart local v3    # "pureWidth":I
a=0;//     :cond_8
a=0;//     #v3=(Integer);v4=(Boolean);v8=(Conflicted);
a=0;//     add-int/lit8 v7, v3, 0x8
a=0;// 
a=0;//     iput v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private clearMessages()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 919
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->animationHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 920
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->animationHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 921
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private createLayouts(II)V
a=0;//     .locals 9
a=0;//     .param p1, "widthItems"    # I
a=0;//     .param p2, "widthLabel"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/high16 v6, 0x41700000    # 15.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/high16 v5, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 647
a=0;//     #v5=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/StaticLayout;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/text/StaticLayout;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, p1, :cond_6
a=0;// 
a=0;//     .line 648
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/StaticLayout;);
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->isScrollingPerformed:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/beans/WheelView;->buildText(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 649
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsPaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     .line 650
a=0;//     #v2=(Reference,Landroid/text/TextPaint;);
a=0;//     if-lez p2, :cond_5
a=0;// 
a=0;//     sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Reference,Landroid/text/Layout$Alignment;);
a=0;//     move v3, p1
a=0;// 
a=0;//     .line 652
a=0;//     #v3=(Integer);
a=0;//     invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
a=0;// 
a=0;//     .line 648
a=0;//     #v0=(Reference,Landroid/text/StaticLayout;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     .line 657
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->isScrollingPerformed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     .line 658
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->valueLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/StaticLayout;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->valueLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/text/StaticLayout;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, p1, :cond_9
a=0;// 
a=0;//     .line 659
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getAdapter()Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getAdapter()Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 660
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     .line 659
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItem(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 661
a=0;//     .local v8, "text":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/StaticLayout;);
a=0;//     if-eqz v8, :cond_7
a=0;// 
a=0;//     move-object v1, v8
a=0;// 
a=0;//     .line 662
a=0;//     :goto_2
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->valuePaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     .line 663
a=0;//     #v2=(Reference,Landroid/text/TextPaint;);
a=0;//     if-lez p2, :cond_8
a=0;// 
a=0;//     sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;
a=0;// 
a=0;//     :goto_3
a=0;//     #v4=(Reference,Landroid/text/Layout$Alignment;);
a=0;//     move v3, p1
a=0;// 
a=0;//     .line 665
a=0;//     #v3=(Integer);
a=0;//     invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
a=0;// 
a=0;//     .line 661
a=0;//     #v0=(Reference,Landroid/text/StaticLayout;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->valueLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     .line 672
a=0;//     .end local v8    # "text":Ljava/lang/String;
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-lez p2, :cond_4
a=0;// 
a=0;//     .line 673
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/StaticLayout;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/text/StaticLayout;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, p2, :cond_b
a=0;// 
a=0;//     .line 674
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/StaticLayout;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->label:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->valuePaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     .line 675
a=0;//     #v2=(Reference,Landroid/text/TextPaint;);
a=0;//     sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;
a=0;// 
a=0;//     #v4=(Reference,Landroid/text/Layout$Alignment;);
a=0;//     move v3, p2
a=0;// 
a=0;//     .line 676
a=0;//     #v3=(Integer);
a=0;//     invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V
a=0;// 
a=0;//     .line 674
a=0;//     #v0=(Reference,Landroid/text/StaticLayout;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     .line 681
a=0;//     :cond_4
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 651
a=0;//     :cond_5
a=0;//     #v0=(UninitRef,Landroid/text/StaticLayout;);v1=(Reference,Ljava/lang/String;);v2=(Reference,Landroid/text/TextPaint;);v3=(Uninit);v4=(Uninit);v8=(Null);
a=0;//     sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;
a=0;// 
a=0;//     #v4=(Reference,Landroid/text/Layout$Alignment;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 654
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/StaticLayout;);
a=0;//     invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->increaseWidthTo(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 661
a=0;//     .restart local v8    # "text":Ljava/lang/String;
a=0;//     :cond_7
a=0;//     #v0=(UninitRef,Landroid/text/StaticLayout;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 664
a=0;//     :cond_8
a=0;//     #v2=(Reference,Landroid/text/TextPaint;);
a=0;//     sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;
a=0;// 
a=0;//     #v4=(Reference,Landroid/text/Layout$Alignment;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 666
a=0;//     .end local v8    # "text":Ljava/lang/String;
a=0;//     :cond_9
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v8=(Null);
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->isScrollingPerformed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 667
a=0;//     iput-object v8, p0, Lcom/twocloo/com/cn/beans/WheelView;->valueLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 669
a=0;//     :cond_a
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->valueLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/StaticLayout;);
a=0;//     invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->increaseWidthTo(I)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 678
a=0;//     :cond_b
a=0;//     #v0=(Integer);v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/StaticLayout;);
a=0;//     invoke-virtual {v0, p2}, Landroid/text/StaticLayout;->increaseWidthTo(I)V
a=0;// 
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method private doScroll(I)V
a=0;//     .locals 6
a=0;//     .param p1, "delta"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 830
a=0;//     #v5=(Null);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v3, p1
a=0;// 
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     .line 832
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getItemHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     div-int v0, v3, v4
a=0;// 
a=0;//     .line 833
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     sub-int v2, v3, v0
a=0;// 
a=0;//     .line 834
a=0;//     .local v2, "pos":I
a=0;//     #v2=(Integer);
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->isCyclic:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     invoke-interface {v3}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_3
a=0;// 
a=0;//     .line 836
a=0;//     :goto_0
a=0;//     if-ltz v2, :cond_2
a=0;// 
a=0;//     .line 839
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     invoke-interface {v3}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     rem-int/2addr v2, v3
a=0;// 
a=0;//     .line 855
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     .line 856
a=0;//     .local v1, "offset":I
a=0;//     #v1=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     if-eq v2, v3, :cond_6
a=0;// 
a=0;//     .line 857
a=0;//     invoke-virtual {p0, v2, v5}, Lcom/twocloo/com/cn/beans/WheelView;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 863
a=0;//     :goto_2
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getItemHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     mul-int/2addr v3, v0
a=0;// 
a=0;//     sub-int v3, v1, v3
a=0;// 
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     .line 864
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-le v3, v4, :cond_1
a=0;// 
a=0;//     .line 865
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     rem-int/2addr v3, v4
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     .line 867
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     .line 837
a=0;//     .end local v1    # "offset":I
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     invoke-interface {v3}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 840
a=0;//     :cond_3
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->isScrollingPerformed:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 842
a=0;//     if-gez v2, :cond_4
a=0;// 
a=0;//     .line 843
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     .line 844
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 845
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     invoke-interface {v3}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     .line 846
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     invoke-interface {v4}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     .line 847
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     invoke-interface {v3}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v2, v3, -0x1
a=0;// 
a=0;//     .line 849
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 851
a=0;//     :cond_5
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 852
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     invoke-interface {v3}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 859
a=0;//     .restart local v1    # "offset":I
a=0;//     :cond_6
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->invalidate()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private drawCenterRect(Landroid/graphics/Canvas;)V
a=0;//     .locals 7
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 802
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int/lit8 v0, v2, 0x2
a=0;// 
a=0;//     .line 803
a=0;//     .local v0, "center":I
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getItemHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     div-int/lit8 v1, v2, 0x2
a=0;// 
a=0;//     .line 804
a=0;//     .local v1, "offset":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->centerDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     sub-int v4, v0, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 805
a=0;//     #v5=(Integer);
a=0;//     add-int v6, v0, v1
a=0;// 
a=0;//     .line 804
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 806
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->centerDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 807
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private drawItems(Landroid/graphics/Canvas;)V
a=0;//     .locals 4
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 783
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 785
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/StaticLayout;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/text/StaticLayout;->getLineTop(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 786
a=0;//     .local v0, "top":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     neg-int v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 788
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsPaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/TextPaint;);
a=0;//     const/high16 v2, -0x1000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/text/TextPaint;->setColor(I)V
a=0;// 
a=0;//     .line 789
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsPaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getDrawableState()[I
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     iput-object v2, v1, Landroid/text/TextPaint;->drawableState:[I
a=0;// 
a=0;//     .line 790
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 792
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 793
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private drawShadows(Landroid/graphics/Canvas;)V
a=0;//     .locals 5
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 738
a=0;//     #v4=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->topShadow:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->visibleItems:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v4, v4, v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 739
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->topShadow:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 741
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->bottomShadow:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->visibleItems:I
a=0;// 
a=0;//     div-int/2addr v2, v3
a=0;// 
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     .line 742
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 741
a=0;//     invoke-virtual {v0, v4, v1, v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 743
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->bottomShadow:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 744
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private drawValue(Landroid/graphics/Canvas;)V
a=0;//     .locals 4
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 753
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->valuePaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/TextPaint;);
a=0;//     const/high16 v2, -0x10000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/text/TextPaint;->setColor(I)V
a=0;// 
a=0;//     .line 754
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->valuePaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getDrawableState()[I
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     iput-object v2, v1, Landroid/text/TextPaint;->drawableState:[I
a=0;// 
a=0;//     .line 756
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .line 757
a=0;//     .local v0, "bounds":Landroid/graphics/Rect;
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->visibleItems:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/text/StaticLayout;->getLineBounds(ILandroid/graphics/Rect;)I
a=0;// 
a=0;//     .line 760
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 761
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 762
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/text/StaticLayout;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, v0, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 763
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/StaticLayout;);
a=0;//     invoke-virtual {v1, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 764
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 768
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->valueLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 769
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 770
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget v2, v0, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 771
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->valueLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/StaticLayout;);
a=0;//     invoke-virtual {v1, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 772
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 774
a=0;//     :cond_1
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getDesiredHeight(Landroid/text/Layout;)I
a=0;//     .locals 3
a=0;//     .param p1, "layout"    # Landroid/text/Layout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 458
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 459
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 468
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 462
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getItemHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->visibleItems:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/2addr v1, v2
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->ITEM_OFFSET:I
a=0;// 
a=0;//     mul-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     add-int/lit8 v0, v1, -0xf
a=0;// 
a=0;//     .line 466
a=0;//     .local v0, "desired":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getSuggestedMinimumHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 468
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getItemHeight()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 556
a=0;//     #v1=(PosByte);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 557
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemHeight:I
a=0;// 
a=0;//     .line 563
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 558
a=0;//     :cond_0
a=0;//     #v1=(PosByte);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/StaticLayout;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/text/StaticLayout;->getLineCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     .line 559
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/StaticLayout;);
a=0;//     invoke-virtual {v0, v1}, Landroid/text/StaticLayout;->getLineTop(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/StaticLayout;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/text/StaticLayout;->getLineTop(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemHeight:I
a=0;// 
a=0;//     .line 560
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemHeight:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 563
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(PosByte);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->visibleItems:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/2addr v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getMaxTextLength()I
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 526
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getAdapter()Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 527
a=0;//     .local v0, "adapter":Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 547
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v6
a=0;// 
a=0;//     .line 531
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-interface {v0}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getMaximumLength()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 532
a=0;//     .local v1, "adapterLength":I
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     move v6, v1
a=0;// 
a=0;//     .line 533
a=0;//     #v6=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 536
a=0;//     :cond_2
a=0;//     #v6=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 537
a=0;//     .local v4, "maxText":Ljava/lang/String;
a=0;//     #v4=(Null);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->visibleItems:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     div-int/lit8 v2, v7, 0x2
a=0;// 
a=0;//     .line 538
a=0;//     .local v2, "addItems":I
a=0;//     #v2=(Integer);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     sub-int/2addr v7, v2
a=0;// 
a=0;//     invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 539
a=0;//     .local v3, "i":I
a=0;//     :goto_1
a=0;//     #v3=(Integer);v4=(Reference,Ljava/lang/String;);v5=(Conflicted);v8=(Conflicted);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/beans/WheelView;->visibleItems:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     add-int/2addr v7, v8
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 538
a=0;//     invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-lt v3, v7, :cond_3
a=0;// 
a=0;//     .line 547
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 540
a=0;//     :cond_3
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v0, v3}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItem(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 541
a=0;//     .local v5, "text":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 542
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     if-ge v7, v8, :cond_5
a=0;// 
a=0;//     .line 543
a=0;//     :cond_4
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 539
a=0;//     :cond_5
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private getTextItem(I)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 479
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     invoke-interface {v2}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 492
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 482
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     invoke-interface {v2}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 483
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     if-ltz p1, :cond_2
a=0;// 
a=0;//     if-lt p1, v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     iget-boolean v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->isCyclic:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 486
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     if-ltz p1, :cond_4
a=0;// 
a=0;//     .line 491
a=0;//     rem-int/2addr p1, v0
a=0;// 
a=0;//     .line 492
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     invoke-interface {v1, p1}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItem(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 487
a=0;//     :cond_4
a=0;//     #v1=(Null);
a=0;//     add-int/2addr p1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private initData(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     new-instance v0, Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/GestureDetector;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->gestureListener:Landroid/view/GestureDetector$SimpleOnGestureListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/GestureDetector$SimpleOnGestureListener;);
a=0;//     invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->gestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->gestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V
a=0;// 
a=0;//     .line 174
a=0;//     new-instance v0, Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/Scroller;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     .line 175
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initResourcesIfNecessary()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const v3, 0x3dcccccd    # 0.1f
a=0;// 
a=0;//     .line 417
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsPaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/TextPaint;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 418
a=0;//     new-instance v0, Landroid/text/TextPaint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/TextPaint;);
a=0;//     const/16 v1, 0x21
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/TextPaint;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsPaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     .line 421
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsPaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->TEXT_SIZE:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V
a=0;// 
a=0;//     .line 424
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->valuePaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 425
a=0;//     new-instance v0, Landroid/text/TextPaint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/TextPaint;);
a=0;//     const/16 v1, 0x25
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/TextPaint;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->valuePaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     .line 428
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->valuePaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->TEXT_SIZE:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V
a=0;// 
a=0;//     .line 429
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->valuePaint:Landroid/text/TextPaint;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const v2, -0x3f3f40
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v3, v1, v3, v2}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V
a=0;// 
a=0;//     .line 432
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->centerDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 433
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 434
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->wheel_val:I
a=0;// 
a=0;//     .line 433
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->centerDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 437
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->topShadow:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 438
a=0;//     new-instance v0, Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget-object v1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;
a=0;// 
a=0;//     .line 439
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable$Orientation;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/beans/WheelView;->SHADOWS_COLORS:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
a=0;// 
a=0;//     .line 438
a=0;//     #v0=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->topShadow:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 442
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->bottomShadow:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 443
a=0;//     new-instance v0, Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget-object v1, Landroid/graphics/drawable/GradientDrawable$Orientation;->BOTTOM_TOP:Landroid/graphics/drawable/GradientDrawable$Orientation;
a=0;// 
a=0;//     .line 444
a=0;//     #v1=(Reference,Landroid/graphics/drawable/GradientDrawable$Orientation;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/beans/WheelView;->SHADOWS_COLORS:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
a=0;// 
a=0;//     .line 443
a=0;//     #v0=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->bottomShadow:Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     .line 447
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->wheel_bg:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/beans/WheelView;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 448
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private invalidateLayouts()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 408
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     .line 409
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->valueLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     .line 410
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     .line 411
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private justify()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 954
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 976
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 958
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->lastScrollY:I
a=0;// 
a=0;//     .line 959
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     .line 960
a=0;//     .local v4, "offset":I
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getItemHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 961
a=0;//     .local v6, "itemHeight":I
a=0;//     #v6=(Integer);
a=0;//     if-lez v4, :cond_4
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     .line 962
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     invoke-interface {v2}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_3
a=0;// 
a=0;//     move v7, v8
a=0;// 
a=0;//     .line 963
a=0;//     .local v7, "needToIncrease":Z
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v7=(Boolean);
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->isCyclic:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 964
a=0;//     :cond_1
a=0;//     int-to-float v0, v4
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v2, v6
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const/high16 v3, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-float/2addr v2, v3
a=0;// 
a=0;//     cmpl-float v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 965
a=0;//     if-gez v4, :cond_6
a=0;// 
a=0;//     .line 966
a=0;//     add-int/lit8 v0, v6, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v4, v0
a=0;// 
a=0;//     .line 970
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-le v0, v8, :cond_7
a=0;// 
a=0;//     .line 971
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     const/16 v5, 0x190
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 972
a=0;//     invoke-direct {p0, v8}, Lcom/twocloo/com/cn/beans/WheelView;->setNextMessage(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v7    # "needToIncrease":Z
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Integer);v3=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     move v7, v1
a=0;// 
a=0;//     .line 962
a=0;//     #v7=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);v2=(Uninit);v7=(Uninit);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     move v7, v8
a=0;// 
a=0;//     #v7=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v7=(Uninit);
a=0;//     move v7, v1
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 968
a=0;//     .restart local v7    # "needToIncrease":Z
a=0;//     :cond_6
a=0;//     #v0=(Byte);v2=(Float);v3=(Integer);v7=(Boolean);
a=0;//     add-int/lit8 v0, v6, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int/2addr v4, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 974
a=0;//     :cond_7
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->finishScrolling()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setNextMessage(I)V
a=0;//     .locals 1
a=0;//     .param p1, "message"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 911
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->clearMessages()V
a=0;// 
a=0;//     .line 912
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->animationHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 913
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private startScrolling()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 982
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->isScrollingPerformed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 983
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->isScrollingPerformed:Z
a=0;// 
a=0;//     .line 984
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->notifyScrollingListenersAboutStart()V
a=0;// 
a=0;//     .line 986
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addChangingListener(Lcom/twocloo/com/cn/beans/OnWheelChangedListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/twocloo/com/cn/beans/OnWheelChangedListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 259
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->changingListeners:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 260
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addScrollingListener(Lcom/twocloo/com/cn/beans/OnWheelScrollListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/twocloo/com/cn/beans/OnWheelScrollListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 293
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingListeners:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 294
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method finishScrolling()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 992
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->isScrollingPerformed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 993
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->notifyScrollingListenersAboutEnd()V
a=0;// 
a=0;//     .line 994
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->isScrollingPerformed:Z
a=0;// 
a=0;//     .line 996
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->invalidateLayouts()V
a=0;// 
a=0;//     .line 997
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->invalidate()V
a=0;// 
a=0;//     .line 998
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getAdapter()Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrentItem()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 330
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getLabel()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 235
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->label:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getVisibleItems()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->visibleItems:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCyclic()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 388
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->isCyclic:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected notifyChangingListeners(II)V
a=0;//     .locals 3
a=0;//     .param p1, "oldValue"    # I
a=0;//     .param p2, "newValue"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 281
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->changingListeners:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 284
a=0;//     return-void
a=0;// 
a=0;//     .line 281
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/OnWheelChangedListener;
a=0;// 
a=0;//     .line 282
a=0;//     .local v0, "listener":Lcom/twocloo/com/cn/beans/OnWheelChangedListener;
a=0;//     invoke-interface {v0, p0, p1, p2}, Lcom/twocloo/com/cn/beans/OnWheelChangedListener;->onChanged(Lcom/twocloo/com/cn/beans/WheelView;II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected notifyScrollingListenersAboutEnd()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingListeners:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 322
a=0;//     return-void
a=0;// 
a=0;//     .line 319
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/OnWheelScrollListener;
a=0;// 
a=0;//     .line 320
a=0;//     .local v0, "listener":Lcom/twocloo/com/cn/beans/OnWheelScrollListener;
a=0;//     invoke-interface {v0, p0}, Lcom/twocloo/com/cn/beans/OnWheelScrollListener;->onScrollingFinished(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected notifyScrollingListenersAboutStart()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 310
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingListeners:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 313
a=0;//     return-void
a=0;// 
a=0;//     .line 310
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/OnWheelScrollListener;
a=0;// 
a=0;//     .line 311
a=0;//     .local v0, "listener":Lcom/twocloo/com/cn/beans/OnWheelScrollListener;
a=0;//     invoke-interface {v0, p0}, Lcom/twocloo/com/cn/beans/OnWheelScrollListener;->onScrollingStarted(Lcom/twocloo/com/cn/beans/WheelView;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 2
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 708
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 710
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/StaticLayout;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 711
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 712
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/high16 v1, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/twocloo/com/cn/beans/WheelView;->calculateLayoutWidth(II)I
a=0;// 
a=0;//     .line 718
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 719
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 721
a=0;//     const/high16 v0, 0x41200000    # 10.0f
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->ITEM_OFFSET:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     neg-int v1, v1
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 722
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/WheelView;->drawItems(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 723
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/WheelView;->drawValue(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 724
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 727
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/WheelView;->drawCenterRect(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 728
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/beans/WheelView;->drawShadows(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 729
a=0;//     return-void
a=0;// 
a=0;//     .line 714
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsWidth:I
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/twocloo/com/cn/beans/WheelView;->createLayouts(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 7
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 685
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 686
a=0;//     .local v4, "widthMode":I
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 687
a=0;//     .local v1, "heightMode":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 688
a=0;//     .local v5, "widthSize":I
a=0;//     #v5=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 690
a=0;//     .local v2, "heightSize":I
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0, v5, v4}, Lcom/twocloo/com/cn/beans/WheelView;->calculateLayoutWidth(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 693
a=0;//     .local v3, "width":I
a=0;//     #v3=(Integer);
a=0;//     const/high16 v6, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne v1, v6, :cond_1
a=0;// 
a=0;//     .line 694
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 703
a=0;//     .local v0, "height":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v3, v0}, Lcom/twocloo/com/cn/beans/WheelView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 704
a=0;//     return-void
a=0;// 
a=0;//     .line 696
a=0;//     .end local v0    # "height":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/beans/WheelView;->itemsLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     #v6=(Reference,Landroid/text/StaticLayout;);
a=0;//     invoke-direct {p0, v6}, Lcom/twocloo/com/cn/beans/WheelView;->getDesiredHeight(Landroid/text/Layout;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 698
a=0;//     .restart local v0    # "height":I
a=0;//     #v0=(Integer);
a=0;//     const/high16 v6, -0x80000000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne v1, v6, :cond_0
a=0;// 
a=0;//     .line 699
a=0;//     invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 3
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 811
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getAdapter()Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 812
a=0;//     .local v0, "adapter":Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 820
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 816
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->gestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/GestureDetector;);
a=0;//     invoke-virtual {v1, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 817
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 818
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->justify()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public removeChangingListener(Lcom/twocloo/com/cn/beans/OnWheelChangedListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/twocloo/com/cn/beans/OnWheelChangedListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 269
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->changingListeners:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 270
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeScrollingListener(Lcom/twocloo/com/cn/beans/OnWheelScrollListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/twocloo/com/cn/beans/OnWheelScrollListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingListeners:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 304
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public scroll(II)V
a=0;//     .locals 7
a=0;//     .param p1, "itemsToScroll"    # I
a=0;//     .param p2, "time"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1009
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Scroller;->forceFinished(Z)V
a=0;// 
a=0;//     .line 1011
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scrollingOffset:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->lastScrollY:I
a=0;// 
a=0;//     .line 1012
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getItemHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     mul-int v6, p1, v0
a=0;// 
a=0;//     .line 1014
a=0;//     .local v6, "offset":I
a=0;//     #v6=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/beans/WheelView;->lastScrollY:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/beans/WheelView;->lastScrollY:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int v4, v6, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v5, p2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 1015
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/beans/WheelView;->setNextMessage(I)V
a=0;// 
a=0;//     .line 1017
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->startScrolling()V
a=0;// 
a=0;//     .line 1018
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Lcom/twocloo/com/cn/adapters/WheelAdapter;)V
a=0;//     .locals 0
a=0;//     .param p1, "adapter"    # Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     .line 194
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->invalidateLayouts()V
a=0;// 
a=0;//     .line 195
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->invalidate()V
a=0;// 
a=0;//     .line 196
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCurrentItem(I)V
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 378
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/twocloo/com/cn/beans/WheelView;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 379
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCurrentItem(IZ)V
a=0;//     .locals 3
a=0;//     .param p1, "index"    # I
a=0;//     .param p2, "animated"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 342
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     invoke-interface {v1}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 369
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 345
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);
a=0;//     if-ltz p1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     invoke-interface {v1}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt p1, v1, :cond_3
a=0;// 
a=0;//     .line 346
a=0;//     :cond_2
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->isCyclic:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 347
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     if-ltz p1, :cond_4
a=0;// 
a=0;//     .line 350
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     invoke-interface {v1}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     rem-int/2addr p1, v1
a=0;// 
a=0;//     .line 355
a=0;//     :cond_3
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     if-eq p1, v1, :cond_0
a=0;// 
a=0;//     .line 356
a=0;//     if-eqz p2, :cond_5
a=0;// 
a=0;//     .line 357
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     sub-int v1, p1, v1
a=0;// 
a=0;//     const/16 v2, 0x190
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/twocloo/com/cn/beans/WheelView;->scroll(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 348
a=0;//     :cond_4
a=0;//     #v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->adapter:Lcom/twocloo/com/cn/adapters/WheelAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/WheelAdapter;);
a=0;//     invoke-interface {v1}, Lcom/twocloo/com/cn/adapters/WheelAdapter;->getItemsCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr p1, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 359
a=0;//     :cond_5
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->invalidateLayouts()V
a=0;// 
a=0;//     .line 361
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     .line 362
a=0;//     .local v0, "old":I
a=0;//     #v0=(Integer);
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     .line 364
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/beans/WheelView;->currentItem:I
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/beans/WheelView;->notifyChangingListeners(II)V
a=0;// 
a=0;//     .line 366
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->invalidate()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setCyclic(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "isCyclic"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 398
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/beans/WheelView;->isCyclic:Z
a=0;// 
a=0;//     .line 400
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->invalidate()V
a=0;// 
a=0;//     .line 401
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/beans/WheelView;->invalidateLayouts()V
a=0;// 
a=0;//     .line 402
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;//     .locals 2
a=0;//     .param p1, "interpolator"    # Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V
a=0;// 
a=0;//     .line 206
a=0;//     new-instance v0, Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->scroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     .line 207
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLabel(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "newLabel"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 245
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->label:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->label:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 246
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WheelView;->label:Ljava/lang/String;
a=0;// 
a=0;//     .line 247
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/beans/WheelView;->labelLayout:Landroid/text/StaticLayout;
a=0;// 
a=0;//     .line 248
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->invalidate()V
a=0;// 
a=0;//     .line 250
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setVisibleItems(I)V
a=0;//     .locals 0
a=0;//     .param p1, "count"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/beans/WheelView;->visibleItems:I
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WheelView;->invalidate()V
a=0;// 
a=0;//     .line 227
a=0;//     return-void
a=0;// .end method
}}
