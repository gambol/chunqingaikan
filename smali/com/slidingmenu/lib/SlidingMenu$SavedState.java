package com.slidingmenu.lib; class SlidingMenu$SavedState { void a() { int a;
a=0;// .class public Lcom/slidingmenu/lib/SlidingMenu$SavedState;
a=0;// .super Landroid/view/View$BaseSavedState;
a=0;// .source "SlidingMenu.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/slidingmenu/lib/SlidingMenu;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "SavedState"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final CREATOR:Landroid/os/Parcelable$Creator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/os/Parcelable$Creator",
a=0;//             "<",
a=0;//             "Lcom/slidingmenu/lib/SlidingMenu$SavedState;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mItem:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 920
a=0;//     new-instance v0, Lcom/slidingmenu/lib/SlidingMenu$SavedState$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/slidingmenu/lib/SlidingMenu$SavedState$1;);
a=0;//     invoke-direct {v0}, Lcom/slidingmenu/lib/SlidingMenu$SavedState$1;-><init>()V
a=0;// 
a=0;//     .line 919
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu$SavedState$1;);
a=0;//     sput-object v0, Lcom/slidingmenu/lib/SlidingMenu$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     .line 928
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 1
a=0;//     .param p1, "in"    # Landroid/os/Parcel;
a=0;// 
a=0;//     .prologue
a=0;//     .line 903
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     .line 904
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/SlidingMenu$SavedState;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/slidingmenu/lib/SlidingMenu$SavedState;->mItem:I
a=0;// 
a=0;//     .line 905
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/os/Parcel;Lcom/slidingmenu/lib/SlidingMenu$SavedState;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 902
a=0;//     invoke-direct {p0, p1}, Lcom/slidingmenu/lib/SlidingMenu$SavedState;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/SlidingMenu$SavedState;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/os/Parcelable;I)V
a=0;//     .locals 0
a=0;//     .param p1, "superState"    # Landroid/os/Parcelable;
a=0;//     .param p2, "item"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 898
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 899
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/SlidingMenu$SavedState;);
a=0;//     iput p2, p0, Lcom/slidingmenu/lib/SlidingMenu$SavedState;->mItem:I
a=0;// 
a=0;//     .line 900
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getItem()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 908
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/SlidingMenu$SavedState;->mItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 1
a=0;//     .param p1, "out"    # Landroid/os/Parcel;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 915
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V
a=0;// 
a=0;//     .line 916
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/SlidingMenu$SavedState;->mItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 917
a=0;//     return-void
a=0;// .end method
}}
