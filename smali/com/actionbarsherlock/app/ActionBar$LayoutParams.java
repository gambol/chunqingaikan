package com.actionbarsherlock.app; class ActionBar$LayoutParams { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/app/ActionBar$LayoutParams;
a=0;// .super Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// .source "ActionBar.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/app/ActionBar;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "LayoutParams"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ATTRS:[I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public gravity:I
a=0;//     .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
a=0;//         mapping = {
a=0;//             .subannotation Landroid/view/ViewDebug$IntToString;
a=0;//                 from = -0x1
a=0;//                 to = "NONE"
a=0;//             .end subannotation,
a=0;//             .subannotation Landroid/view/ViewDebug$IntToString;
a=0;//                 from = 0x0
a=0;//                 to = "NONE"
a=0;//             .end subannotation,
a=0;//             .subannotation Landroid/view/ViewDebug$IntToString;
a=0;//                 from = 0x30
a=0;//                 to = "TOP"
a=0;//             .end subannotation,
a=0;//             .subannotation Landroid/view/ViewDebug$IntToString;
a=0;//                 from = 0x50
a=0;//                 to = "BOTTOM"
a=0;//             .end subannotation,
a=0;//             .subannotation Landroid/view/ViewDebug$IntToString;
a=0;//                 from = 0x3
a=0;//                 to = "LEFT"
a=0;//             .end subannotation,
a=0;//             .subannotation Landroid/view/ViewDebug$IntToString;
a=0;//                 from = 0x5
a=0;//                 to = "RIGHT"
a=0;//             .end subannotation,
a=0;//             .subannotation Landroid/view/ViewDebug$IntToString;
a=0;//                 from = 0x10
a=0;//                 to = "CENTER_VERTICAL"
a=0;//             .end subannotation,
a=0;//             .subannotation Landroid/view/ViewDebug$IntToString;
a=0;//                 from = 0x70
a=0;//                 to = "FILL_VERTICAL"
a=0;//             .end subannotation,
a=0;//             .subannotation Landroid/view/ViewDebug$IntToString;
a=0;//                 from = 0x1
a=0;//                 to = "CENTER_HORIZONTAL"
a=0;//             .end subannotation,
a=0;//             .subannotation Landroid/view/ViewDebug$IntToString;
a=0;//                 from = 0x7
a=0;//                 to = "FILL_HORIZONTAL"
a=0;//             .end subannotation,
a=0;//             .subannotation Landroid/view/ViewDebug$IntToString;
a=0;//                 from = 0x11
a=0;//                 to = "CENTER"
a=0;//             .end subannotation,
a=0;//             .subannotation Landroid/view/ViewDebug$IntToString;
a=0;//                 from = 0x77
a=0;//                 to = "FILL"
a=0;//             .end subannotation
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 899
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 900
a=0;//     #v1=(Null);
a=0;//     const v2, 0x10100b3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     .line 899
a=0;//     sput-object v0, Lcom/actionbarsherlock/app/ActionBar$LayoutParams;->ATTRS:[I
a=0;// 
a=0;//     .line 901
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 2
a=0;//     .param p1, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 943
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0, v0, v1, p1}, Lcom/actionbarsherlock/app/ActionBar$LayoutParams;-><init>(III)V
a=0;// 
a=0;//     .line 944
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/app/ActionBar$LayoutParams;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(II)V
a=0;//     .locals 1
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 933
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 922
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/app/ActionBar$LayoutParams;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 934
a=0;//     const/16 v0, 0x13
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 935
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(III)V
a=0;//     .locals 1
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "height"    # I
a=0;//     .param p3, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 938
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 922
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/app/ActionBar$LayoutParams;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 939
a=0;//     iput p3, p0, Lcom/actionbarsherlock/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 940
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 3
a=0;//     .param p1, "c"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 925
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 922
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/app/ActionBar$LayoutParams;);
a=0;//     iput v2, p0, Lcom/actionbarsherlock/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 927
a=0;//     sget-object v1, Lcom/actionbarsherlock/app/ActionBar$LayoutParams;->ATTRS:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 928
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 929
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 930
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "source"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 953
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 922
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/app/ActionBar$LayoutParams;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 954
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/actionbarsherlock/app/ActionBar$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "source"    # Lcom/actionbarsherlock/app/ActionBar$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 947
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     .line 922
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/app/ActionBar$LayoutParams;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 949
a=0;//     iget v0, p1, Lcom/actionbarsherlock/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 950
a=0;//     return-void
a=0;// .end method
}}
