package com.actionbarsherlock.internal.widget; class ActionBarView$SavedState { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState;
a=0;// .super Landroid/view/View$BaseSavedState;
a=0;// .source "ActionBarView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
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
a=0;//             "Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field expandedMenuItemId:I
a=0;// 
a=0;// .field isOverflowOpen:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1277
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState$1;);
a=0;//     invoke-direct {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState$1;-><init>()V
a=0;// 
a=0;//     .line 1276
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState$1;);
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     .line 1285
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 1
a=0;//     .param p1, "in"    # Landroid/os/Parcel;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1264
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     .line 1265
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I
a=0;// 
a=0;//     .line 1266
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState;->isOverflowOpen:Z
a=0;// 
a=0;//     .line 1267
a=0;//     return-void
a=0;// 
a=0;//     .line 1266
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/os/Parcel;Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1263
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/os/Parcelable;)V
a=0;//     .locals 0
a=0;//     .param p1, "superState"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1260
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1261
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 1
a=0;//     .param p1, "out"    # Landroid/os/Parcel;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1271
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V
a=0;// 
a=0;//     .line 1272
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 1273
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$SavedState;->isOverflowOpen:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 1274
a=0;//     return-void
a=0;// 
a=0;//     .line 1273
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
