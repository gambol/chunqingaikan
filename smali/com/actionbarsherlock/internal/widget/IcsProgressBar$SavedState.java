package com.actionbarsherlock.internal.widget; class IcsProgressBar$SavedState { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;
a=0;// .super Landroid/view/View$BaseSavedState;
a=0;// .source "IcsProgressBar.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
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
a=0;//             "Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field progress:I
a=0;// 
a=0;// .field secondaryProgress:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1106
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState$1;);
a=0;//     invoke-direct {v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState$1;-><init>()V
a=0;// 
a=0;//     .line 1105
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState$1;);
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     .line 1114
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 1
a=0;//     .param p1, "in"    # Landroid/os/Parcel;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1093
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     .line 1094
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;->progress:I
a=0;// 
a=0;//     .line 1095
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;->secondaryProgress:I
a=0;// 
a=0;//     .line 1096
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/os/Parcel;Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1092
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/os/Parcelable;)V
a=0;//     .locals 0
a=0;//     .param p1, "superState"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1086
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1087
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;);
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
a=0;//     .line 1100
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V
a=0;// 
a=0;//     .line 1101
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;->progress:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 1102
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;->secondaryProgress:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 1103
a=0;//     return-void
a=0;// .end method
}}
